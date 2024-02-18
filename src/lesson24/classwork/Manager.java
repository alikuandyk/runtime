package lesson24.classwork;

import java.util.List;
import java.util.Map;

public interface Manager {
    List<Task> getAllTasks();

    void removeAll();

    Task getTaskById(int id);
    Epic getEpicById(int id);
    Subtask getSubtaskById(int id);

    Task getById(int id);

    void create(Task task);

    void update(int id, Task newTask);

    void delete(int id);

    List<Subtask> getSubtasksByEpicId(int id);
}
