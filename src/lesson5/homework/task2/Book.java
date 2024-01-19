package lesson5.homework.task2;

public class Book {
    String author;
    String title;
    int ID;
    int bookStatus;

    String status;

    void display(){
        if (bookStatus < 50) {
            status = "хорошое";
        } else if (bookStatus > 50 && bookStatus < 100) {
            status = "нормальное";
        } else if (bookStatus > 100) {
            status = "плохое";
        }
        System.out.println("Название книги: " + title);
        System.out.println("Состояние книги " + bookStatus + " days, " + status);
    }
}
