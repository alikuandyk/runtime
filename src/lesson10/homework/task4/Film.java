package lesson10.homework.task4;

public class Film {
    private int id;
    private String name;
    private String description;
    private int releaseYear;
    private double duration;

    public Film(int id, String name, String description, int releaseYear, double duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    int getReleaseYear() {
        return releaseYear;
    }

    double getDuration() {
        return duration;
    }

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    void setDuration(double duration) {
        this.duration = duration;
    }
}
