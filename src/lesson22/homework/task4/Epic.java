package lesson22.homework.task4;

import java.util.ArrayList;

public class Epic {
    private String name;
    private String description;
    private int id;
    private Status status;
    private ArrayList<Subtask> subtasks;

    public Epic(String name, String description, int id, Status status, ArrayList<Subtask> subtasks) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.status = status;
        this.subtasks = subtasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Subtask> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(ArrayList<Subtask> subtasks) {
        this.subtasks = subtasks;
    }

    @Override
    public String toString() {
        return "Epic{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", status=" + status +
                ", subtasks=" + subtasks +
                '}';
    }
}
