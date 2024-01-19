package lesson8.classwork;

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
}
