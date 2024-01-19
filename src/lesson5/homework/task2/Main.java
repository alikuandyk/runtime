package lesson5.homework.task2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.availableBook = new Book();
        library.availableBook.title = "Книга братан";


        Person student = new Person();
        student.status = "Студент";

        library.lendBook(student, 5);
        library.acceptBook(student);
        student.display();

//        library.availableBook.display();
    }
}
