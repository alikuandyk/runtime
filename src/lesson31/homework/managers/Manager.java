package lesson31.homework.managers;

import lesson31.homework.tasks.Epic;
import lesson31.homework.tasks.Subtask;
import lesson31.homework.tasks.Task;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Manager {
    List<Task> getAllTasks() throws IOException;

    void removeAll();

    Task getTaskById(int id) throws IOException;
    Epic getEpicById(int id);
    Subtask getSubtaskById(int id);

    void createTask(Task task) throws IOException;
    void createEpic(Epic epic);
    void createSubtask(Subtask subtask);

    void update(int id, Task newTask) throws IOException;

    void delete(int id) throws IOException;

    List<Subtask> getSubtasksByEpicId(int id) throws IOException;
}
