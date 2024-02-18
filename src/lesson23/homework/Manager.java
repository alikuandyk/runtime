package lesson23.homework;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Epic> epics = new ArrayList<>();
    private ArrayList<Subtask> subtasks = new ArrayList<>();

    void displayAllTasks() {
        System.out.println("Список всех задач:");

        System.out.println("Обычные задания:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            for (String taskName : task.getTask().values()) {
                if (taskName != null) {
                    System.out.println((i + 1) + ". " + taskName);
                }
            }
        }

        System.out.println("Эпические задания:");
        for (int i = 0; i < epics.size(); i++) {
            Epic epic = epics.get(i);
            for (String epicName : epic.getTask().values()) {
                if (epicName != null) {
                    System.out.println((i + 1) + ". " + epicName);
                }
            }
        }

        System.out.println("Подзадачи:");
        for (int i = 0; i < subtasks.size(); i++) {
            Subtask subtask = subtasks.get(i);
            for (String subtaskName : subtask.getTask().values()) {
                if (subtaskName != null) {
                    System.out.println((i + 1) + ". " + subtaskName);
                }
            }
        }
    }

    void deleteAllTasks() {
        tasks.clear();
        epics.clear();
        subtasks.clear();
    }

    void displayTaskById(Integer id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getTask().keySet().contains(id)) {
                System.out.println(task.getTask().values());
                return;
            }
        }

        for (int i = 0; i < epics.size(); i++) {
            Epic epic = epics.get(i);
            if (epic.getTask().keySet().contains(id)) {
                System.out.println(epic.getTask().values());
                return;
            }
        }

        for (int i = 0; i < subtasks.size(); i++) {
            Subtask subtask = subtasks.get(i);
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
        this.tasks.add(task);
    }

    void createTask(Epic epic) {
        this.epics.add(epic);
    }

    void createTask(Subtask subtask) {
        this.subtasks.add(subtask);
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
}
