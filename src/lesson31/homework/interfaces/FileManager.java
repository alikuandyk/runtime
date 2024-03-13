package lesson31.homework.interfaces;

import lesson24.classwork.Epic;
import lesson24.classwork.Subtask;
import lesson24.classwork.Task;

import java.io.IOException;

public interface FileManager {
    void saveTask(Task task) throws IOException;
    void saveEpic(Epic epic);
    void saveSubtask(Subtask subtask);
    void loadFromFile();
}
