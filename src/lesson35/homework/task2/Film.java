package lesson35.homework.task2;

import java.time.Duration;
import java.util.ArrayList;

public class Film {
    private String title;
    private double budget;
    private ArrayList<String> genres;
    private Duration duration;

    public Film(String title, double budget, ArrayList<String> genres, Duration duration) {
        this.title = title;
        this.budget = budget;
        this.genres = new ArrayList<>();
        this.duration = duration;
    }

    public void addGenre(String genre) {
        genres.add(genre);
    }

    public String getTitle() {
        return title;
    }

    public double getBudget() {
        return budget;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public Duration getDuration() {
        return duration;
    }
}
