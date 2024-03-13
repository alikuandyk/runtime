package lesson31.homework.interfaces;

import lesson31.homework.tasks.Epic;
import lesson31.homework.tasks.Subtask;
import lesson31.homework.tasks.Task;

import java.util.List;

public interface Manager {
    List<Task> getAllTasks();

    void removeAll();

    Task getTaskById(int id);
    Epic getEpicById(int id);
    Subtask getSubtaskById(int id);

    void createTask(Task task);
    void createEpic(Epic epic);
    void createSubtask(Subtask subtask);

    void update(int id, Task newTask);

    void delete(int id);

    List<Subtask> getSubtasksByEpicId(int id);
}
