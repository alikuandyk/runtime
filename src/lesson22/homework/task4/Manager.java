package lesson22.homework.task4;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Task> tasks;
    private ArrayList<Epic> epics;
    private ArrayList<Subtask> subtasks;

    void getAllTasks() {
        System.out.println("Список всех задач:");

        System.out.println("Обычные задания:");
        for (int i = 0; i < tasks.size(); i++) {
            String taskName = tasks.get(i).getName();
            System.out.println((i + 1) + ". " + taskName);
        }

        System.out.println("Эпические задания:");
        for (int i = 0; i < epics.size(); i++) {
            String epicName = epics.get(i).getName();
            System.out.println((i + 1) + ". " + epicName);
        }

        System.out.println("Подзадачи:");
        for (int i = 0; i < subtasks.size(); i++) {
            String subtaskName = subtasks.get(i).getName();
            System.out.println((i + 1) + ". " + subtaskName + ", входит в эпическую заданию - " + subtasks.get(i).getEpic().getName());
        }
    }

    void deleteAllTasks() {
        tasks.clear();
        epics.clear();
        subtasks.clear();
    }

    void getTaskById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            int taskId = tasks.get(i).getId();
            if (taskId == id) {
                System.out.println(tasks.get(i));
            }
        }
        for (int i = 0; i < epics.size(); i++) {
            int epicId = epics.get(i).getId();
            if (epicId == id) {
                System.out.println(epics.get(i));
            }
        }

        for (int i = 0; i < subtasks.size(); i++) {
            int subtaskId = subtasks.get(i).getId();
            if (subtaskId == id) {
                System.out.println(subtasks.get(i));
            }
        }
    }

    void getSubtasksOfSpecialEpic() {
        for (Epic epic : epics) {
            System.out.println("Эпическое задание: " + epic.getName());
            System.out.println("Подзадачи: ");
            ArrayList<Subtask> subtaskList = epic.getSubtasks();
            for (int i = 0; i < subtaskList.size(); i++) {
                String subtaskName = subtaskList.get(i).getName();
                System.out.println((i +  1) + ". " + subtaskName);
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
        tasks.add(task);
    }

    void createTask(Epic epic) {
        epics.add(epic);
    }

    void createTask(Subtask subtask) {
        subtasks.add(subtask);
    }

    void update(int id) {

    }

    void deleteTaskById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            int taskId = tasks.get(i).getId();
            if (taskId == id) {
                tasks.remove(tasks.get(i));
            }
        }
        for (int i = 0; i < epics.size(); i++) {
            int epicId = epics.get(i).getId();
            if (epicId == id) {
                epics.remove(epics.get(i));
            }
        }

        for (int i = 0; i < subtasks.size(); i++) {
            int subtaskId = subtasks.get(i).getId();
            if (subtaskId == id) {
                subtasks.remove(subtasks.get(i));
            }
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Epic> getEpics() {
        return epics;
    }

    public void setEpics(ArrayList<Epic> epics) {
        this.epics = epics;
    }

    public ArrayList<Subtask> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(ArrayList<Subtask> subtasks) {
        this.subtasks = subtasks;
    }
}
