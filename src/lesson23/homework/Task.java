package lesson23.homework;

import java.util.HashMap;
import java.util.Map;

public class Task {
    private Map<Integer, String> task;
    private String description;
    private Status status;

    public Task(String name, String description) {
        this.task = new HashMap<>();
        this.task.put(GeneratorId.getUniqueId(), name);
        this.description = description;
        this.status = Status.NEW;
    }

    public Map<Integer, String> getTask() {
        return task;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task=" + task +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
