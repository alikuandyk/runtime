package lesson14.homework.task1;

import lesson14.homework.task1.Status;

public class Book {
    private String title;
    private Status status = Status.AVAILABLE;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
