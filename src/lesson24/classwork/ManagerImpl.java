package lesson24.classwork;

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

//    void displayAllTasks() {
//        System.out.println("Список всех задач:");
//
//        System.out.println("Обычные задания:");
//        int a = 1;
//        for (Task task : tasks.values()) {
//            System.out.println(a + ". " + task.getName());
//            a++;
//        }
//
//        System.out.println("Эпические задания:");
//        a = 1;
//        for (Epic epic : epics.values()) {
//            System.out.println(a + ". " + epic.getName());
//            a++;
//        }
//
//        System.out.println("Подзадачи:");
//        a = 1;
//        for (Subtask subtask : subtasks.values()) {
//            System.out.println(a + ". " + subtask.getName());
//            a++;
//        }
//    }

//    void deleteAllTasks() {
//        tasks.clear();
//        epics.clear();
//        subtasks.clear();
//    }

    void displayTaskById(Integer id) {
        for (int i = 0; i < tasks.size(); i++) {
            lesson23.homework.Task task = tasks.get(i);
            if (task.getTask().keySet().contains(id)) {
                System.out.println(task.getTask().values());
                return;
            }
        }

        for (int i = 0; i < epics.size(); i++) {
            lesson23.homework.Epic epic = epics.get(i);
            if (epic.getTask().keySet().contains(id)) {
                System.out.println(epic.getTask().values());
                return;
            }
        }

        for (int i = 0; i < subtasks.size(); i++) {
            lesson23.homework.Subtask subtask = subtasks.get(i);
            if (subtask.getTask().keySet().contains(id)) {
                System.out.println(subtask.getTask().values());
                return;
            }
        }
    }

    void displaySubtasksOfSpecialEpic(Integer id) {
        for (Epic epic : epics) {
            if (epic.getTask().keySet().contains(id)) {
                System.out.println("Эпическое задание: " + epic.getTask().keySet());
                System.out.println("Подзадачи: ");
                ArrayList<Subtask> subtaskList = epic.getSubtasks();
                for (int i = 0; i < subtaskList.size(); i++) {
                    for (String subtaskName : subtaskList.get(i).getTask().values()) {
                        System.out.println((i + 1) + ". " + subtaskName);
                    }
                }
            }
        }
    }

    void statusControl() {
        for (Epic epic : epics) {
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

    void createTask(Task task) {
        int id = getUniqueId();
        this.tasks.put(id, task);
        task.setId(id);
    }

    void createTask(Epic epic) {
        int id = getUniqueId();
        this.epics.put(id, epic);
        epic.setId(id);
    }

    void createTask(Subtask subtask) {
        int id = getUniqueId();
        this.subtasks.put(id, subtask);
        subtask.setId(id);
    }

    void update(Integer id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getTask().keySet().contains(id)) {
                for (Integer integer : task.getTask().keySet()) {
                    integer = GeneratorId.getUniqueId();
                    return;
                }
            }
        }
    }

    void deleteTaskById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getTask().keySet().contains(id)) {
                tasks.remove(task);
                return;
            }
        }

        for (int i = 0; i < tasks.size(); i++) {
            Epic epic = epics.get(i);
            if (epic.getTask().keySet().contains(id)) {
                epics.remove(epic);
                return;
            }
        }

        for (int i = 0; i < tasks.size(); i++) {
            Subtask subtask = subtasks.get(i);
            if (subtask.getTask().keySet().contains(id)) {
                subtasks.remove(subtask);
                return;
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
        return null;
    }

    @Override
    public Epic getEpicById(int id) {
        return null;
    }

    @Override
    public Subtask getSubtaskById(int id) {
        return null;
    }

    @Override
    public Task getById(int id) {
        return null;
    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void update(int id, Task newTask) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Subtask> getSubtasksByEpicId(int id) {
        return null;
    }
}
