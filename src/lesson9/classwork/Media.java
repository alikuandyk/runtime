package lesson9.classwork;

public class Media {
    String name;
    int year;

    public Media(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void display () {
        System.out.println("Название: " + name);
        System.out.println("Год выпуска: " + year);
    }
}
