package lesson31.homework.tasks;

import lesson31.homework.status.Status;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
    private String name;
    private String description;
    private int id;
    private Status status;
    private LocalDateTime startTime;
    private Duration duration;
    private LocalDateTime endTime;
    private static Integer uniqueId = 1;

    public Task(String name, String description, LocalDateTime startTime, Duration duration) {
        this.name = name;
        this.description = description;
        this.status = Status.NEW;
        this.startTime = startTime;
        this.duration = duration;
        this.endTime = startTime.plus(duration);
    }

    public String getStringStartTime() {
        return startTime.toString();
    }

    public static void setUniqueId(int uniqueId) {
        Task.uniqueId = uniqueId;
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public static Integer getUniqueId() {
        return uniqueId;
    }

    public static void setUniqueId(Integer uniqueId) {
        Task.uniqueId = uniqueId;
    }
}
