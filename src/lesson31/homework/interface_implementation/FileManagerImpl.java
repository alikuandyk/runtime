package lesson31.homework.interface_implementation;

import lesson24.classwork.Epic;
import lesson24.classwork.Subtask;
import lesson24.classwork.Task;
import lesson31.homework.interfaces.FileManager;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;

public class FileManagerImpl implements FileManager {
    @Override
    public void saveTask(Task task) throws IOException {
        try (Writer writer = new FileWriter("src/lesson31/homework/task.csv")){
            writer.append("id,name,description,status,start_time,duration,epic_id");
//            writer.append(task.getId() + "," + task.getName() + "," + task.getDescription() + "," + task.getStatus() + ","
//            + "startTime" + "," + "duration" + "," + null);
            writer.append(String.format("%d,%s,%s,%s,%s,%d,%d", task.getId(), task.getName(), task.getDescription(),
                    task.getStatus(), task.getStartTime(), task.getDuration()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void saveEpic(Epic epic) {
    }

    @Override
    public void saveSubtask(Subtask subtask) {
    }

    @Override
    public void loadFromFile() {

    }
}
