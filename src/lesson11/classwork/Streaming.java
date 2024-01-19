package lesson11.classwork;

import java.util.Random;

public class Streaming {
    Media[] media;

    void add(Media mediaa) {
        for (int i = 0; i < this.media.length; i++) {
            if (media[i] == null) {
                this.media[i] = mediaa;
            }
        }
    }

    void display() {
        for (Media media : media) {
            if (media != null) {
                System.out.println(media.name);
            }
        }
    }

    void play(Media media) {
        if (media instanceof Series) {
            Series series = (Series) media;
            System.out.println(media.name);
            System.out.println(media.year);
            System.out.println(series.rating);
            System.out.println(series.numOfEpisodes * series.duration);
        } else if (media instanceof Film) {
            System.out.println(media.name);
            System.out.println(media.year);
            System.out.println(((Film) media).rating);
            System.out.println(((Film) media).duration);
        }
    }

    void displayAllFilm() {
        for (Media film : media) {
            if (film instanceof Film) {
                Film filmm = (Film) film;
                System.out.println("Название: " + filmm.name);
                System.out.println("Год выпуска: " + filmm.year);
                System.out.println("Рейтинг: " + filmm.rating);
                System.out.println("Продолжительность: " + filmm.duration);
                System.out.println();
            }
        }
    }

    void displayAllSeries() {
        for (Media serial : media) {
            if (serial instanceof Series && !(serial instanceof Film)) {
                Series series = (Series) serial;
                System.out.println("Название: " + series.name);
                System.out.println("Год выпуска: " + series.year);
                System.out.println("Рейтинг: " + series.rating);
                System.out.println("Количество серий: " + series.numOfEpisodes);
                System.out.println("Общая продолжительность: " + series.duration * series.numOfEpisodes);
                System.out.println();
            }
        }
    }

    Film getOldestFilm() {
        Media oldestFilm = null;
        int oldest = Integer.MAX_VALUE;
        for (Media film : media) {
            if (film instanceof Film) {
                if (film.year < oldest) {
                    oldest = film.year;
                    oldestFilm = film;
                }
            }
        }
        return (Film) oldestFilm;
    }

    Media getRandom() {
        Random random = new Random();

        int randomIndex = random.nextInt(0, media.length - 1);
        return media[randomIndex];
    }
}