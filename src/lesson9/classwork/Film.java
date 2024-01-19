package lesson9.classwork;

public class Film extends Media {
    double rating;
    double duration;

    public Film(String name, int year, double rating, double duration) {
        super(name, year);
        this.rating = rating;
        this.duration = duration;
    }

    public void display() {
        super.display();
        System.out.println("Рейтинг: " + rating);
        System.out.println("Продолжительность фильма: " + duration);
    }
}
