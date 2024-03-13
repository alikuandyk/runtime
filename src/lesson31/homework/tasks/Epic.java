package lesson31.homework.tasks;

import lesson31.homework.status.Status;
import lesson31.homework.tasks.Subtask;
import lesson31.homework.tasks.Task;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Epic extends Task {
    private ArrayList<Subtask> subtasks;

    public Epic(String name, String description, Status status, LocalDateTime startTime, Duration duration, ArrayList<Subtask> subtasks) {
        super(name, description, startTime, duration);
        this.subtasks = subtasks;
    }

    public Subtask getSubtask(int index) {
        return subtasks.get(index);
    }

    public void addSubtask(Subtask subtask) {
        subtasks.add(subtask);
    }

    public ArrayList<Subtask> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(ArrayList<Subtask> subtasks) {
        this.subtasks = subtasks;
    }
}
