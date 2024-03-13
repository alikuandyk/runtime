package lesson31.homework.interface_implementation;

import lesson31.homework.interfaces.Manager;
import lesson31.homework.status.Status;
import lesson31.homework.tasks.Epic;
import lesson31.homework.tasks.Subtask;
import lesson31.homework.tasks.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerImpl implements Manager {
    private Map<Integer, Task> tasks = new HashMap<>();
    private Map<Integer, Epic> epics = new HashMap<>();
    private Map<Integer, Subtask> subtasks = new HashMap<>();

    private static Integer uniqueId = 1;

    public static Integer getUniqueId() {
        return uniqueId++;
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
    public List<Task> getAllTasks() {
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
    public Task getTaskById(int id) {
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
    public void createTask(Task task) {
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
    public void update(int id, Task newTask) {
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
    public void delete(int id) {
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
    public List<Subtask> getSubtasksByEpicId(int id) {
        Epic epic = epics.get(id);
        return epic.getSubtasks();
    }
}
