package lesson31.homework.managers;

import lesson31.homework.managers.Manager;
import lesson31.homework.status.Status;
import lesson31.homework.tasks.Epic;
import lesson31.homework.tasks.Subtask;
import lesson31.homework.tasks.Task;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerImpl implements Manager {
    private Map<Integer, Task> tasks = new HashMap<>();
    private Map<Integer, Epic> epics = new HashMap<>();
    private Map<Integer, Subtask> subtasks = new HashMap<>();
    private List<Task> priorityTasks = new ArrayList<>();
    private static Integer uniqueId = 1;

    public static Integer getUniqueId() {
        return uniqueId++;
    }

    public void setPriorityTasks() {
        List<Task> list = new ArrayList<>();
        list.addAll(tasks.values());
        list.addAll(epics.values());
        list.addAll(subtasks.values());

        for (int i = 0; i < list.size(); i++) {
            Task prioryTask = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                Task task = list.get(j);
                if (task.compareTo(prioryTask) > 0) {
                    prioryTask = task;
                }
            }
            priorityTasks.add(prioryTask);
            list.remove(prioryTask);
        }
    }

    void statusControl() {
        for (Epic epic : epics.values()) {
            if (epic.getSubtasks().isEmpty()) epic.setStatus(Status.NEW);

            boolean allSubtaskIsNew = true;
            boolean allSubtaskIsDone = true;
            for (Subtask subtask : epic.getSubtasks()) {
                if (subtask.getStatus() != Status.NEW) allSubtaskIsNew = false;
                if (subtask.getStatus() != Status.DONE) allSubtaskIsDone = false;
            }

            if (allSubtaskIsNew) {
                epic.setStatus(Status.NEW);
            } else if (allSubtaskIsDone) {
                epic.setStatus(Status.DONE);
            } else {
                epic.setStatus(Status.IN_PROGRESS);
            }
        }
    }

    @Override
    public List<Task> getAllTasks() throws IOException {
        List<Task> allTasks = new ArrayList<>();
        for (Task value : tasks.values()) {
            allTasks.add(value);
        }

        for (Epic value : epics.values()) {
            allTasks.add(value);
        }

        for (Subtask value : subtasks.values()) {
            allTasks.add(value);
        }

        return allTasks;
    }

    @Override
    public void removeAll() {
        tasks.clear();
        epics.clear();
        subtasks.clear();
    }

    @Override
    public Task getTaskById(int id) throws IOException {
        return tasks.get(id);
    }

    @Override
    public Epic getEpicById(int id) {
        return epics.get(id);
    }

    @Override
    public Subtask getSubtaskById(int id) {
        return subtasks.get(id);
    }

    @Override
    public void createTask(Task task) throws IOException {
        int id = getUniqueId();
        this.tasks.put(id, task);
        task.setId(id);
    }

    @Override
    public void createEpic(Epic epic) {
        int id = getUniqueId();
        this.epics.put(id, epic);
        epic.setId(id);
    }

    @Override
    public void createSubtask(Subtask subtask) {
        int id = getUniqueId();
        this.subtasks.put(id, subtask);
        subtask.setId(id);

        Epic epic = subtask.getEpic();
        epic.addSubtask(subtask);
    }

    @Override
    public void update(int id, Task newTask) throws IOException {
        if (tasks.containsKey(id)) {
            tasks.replace(id, tasks.get(id), newTask);
            return;
        }

        if (epics.containsKey(id)) {
            epics.replace(id, epics.get(id), (Epic) newTask);
            return;
        }

        if (subtasks.containsKey(id)) {
            subtasks.replace(id, subtasks.get(id), (Subtask) newTask);
        }
    }

    @Override
    public void delete(int id) throws IOException {
        if (tasks.containsKey(id)) {
            tasks.remove(id);
            return;
        }

        if (epics.containsKey(id)) {
            epics.remove(id);
            return;
        }

        if (subtasks.containsKey(id)) {
            subtasks.remove(id);
        }
    }

    @Override
    public List<Subtask> getSubtasksByEpicId(int id) throws IOException {
        Epic epic = epics.get(id);
        return epic.getSubtasks();
    }

    public Map<Integer, Task> getTasks() {
        return tasks;
    }

    public Map<Integer, Epic> getEpics() {
        return epics;
    }

    public Map<Integer, Subtask> getSubtasks() {
        return subtasks;
    }

    public void setTasks(int id, Task task) {
        this.tasks.put(id, task);
    }

    public void setEpics(int id, Epic epic) {
        this.epics.put(id, epic);
    }

    public void setSubtasks(int id, Subtask subtask) {
        this.subtasks.put(id, subtask);
    }
}
