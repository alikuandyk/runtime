package lesson8.homework;

public class Genre {
    Film[] films;

    void add(Film film) {
        for (int i = 0; i < films.length; i++) {
            if (films[i] == null) {
                films[i] = film;
                break;
            }
        }
    }

    void display() {
        System.out.println("Фильмы:");
        for (Film film : films) {
            if (film != null) {
                System.out.println(film.title + ", " + film.year);
            }
        }
    }

    Film find(String title) {
        for (Film film : films) {
            if (film != null && title.equals(film.title)) {
                return film;
            }
        }
        return null;
    }

    void displayNumberOfFilms() {
        int numbers = 0;
        for (Film film : films) {
            if (film != null) {
                numbers++;
            }
        }
        System.out.println("Кол-во фильмов: " + numbers);
    }

    void delete(String title) {
        for (int i = 0; i < films.length; i++) {
            if (films[i] != null && title.equals(films[i].title)) {
                films[i] = null;
                break;
            }
        }
    }

    void displayOldestMovie() {
        String oldestTitle = "";
        int oldestYear = 0;
        for (Film film : films) {
            if (film != null && (film.year < oldestYear || oldestYear == 0)) {
                oldestYear = film.year;
                oldestTitle = film.title;
            }
        }
        System.out.println("Самый старый фильм: " + oldestTitle + ", " + oldestYear);
    }
}