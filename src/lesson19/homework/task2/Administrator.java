package lesson19.homework.task2;

public interface Administrator {
    void findBook(String bookTitle);
    void issueBook(String bookTitle, Reader reader);
    void overdueNotification(Reader reader);
}
