package lesson21.homework;

public class Main {
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 0),
                new Movie("Название 1", 2017, 18),
                new Movie("Название 2", 2020, 21)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Театр 1", 2009, 16),
                new Theatre("Театр 2", 2014, 18)
        };
    }

    public static void validEvent(Event event) {
        if (event.getTitle().equals(null) || event.getAge() == 0 || event.getReleaseYear() == 0) {
            System.out.println(event);
            throw new RuntimeException();
        }
    }
}
