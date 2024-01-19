package lesson5.homework.task2;

public class Person {
    String name;
    int studentIDCard;
    Book borrowedBook;
    String history = "";
    int rentalDays;
    String status;

    void display() {
        System.out.println("Студент: " + name);
        System.out.println("Студенческий билет: " + studentIDCard);
        String a = borrowedBook != null ? borrowedBook.title : null;
        System.out.println("Текущая книга: " + a);
        System.out.println("История прочитанных книг: " + history);
        System.out.println();
    }
}
