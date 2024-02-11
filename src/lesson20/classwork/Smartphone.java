package lesson20.classwork;

import java.util.Objects;

public class Smartphone {
    private String name;
    private int publishedYear;

    public Smartphone(String name, int publishedYear) {
        this.name = name;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "smartphone={name=%s, publishedYear=%d}".formatted(name, publishedYear);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this != obj) return false;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return Objects.equals(name, smartphone.name) && publishedYear == smartphone.publishedYear;
    }
}
