package lesson14.homework.task1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("title");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());
    }
}
