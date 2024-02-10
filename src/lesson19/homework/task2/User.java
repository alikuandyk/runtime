package lesson19.homework.task2;

public class User implements Reader, Librarian, Supplier, Administrator {
    @Override
    public void takeBook(String bookTitle) {
        System.out.println("Читатель взял книгу: " + bookTitle);
    }

    @Override
    public void returnBook(String bookTitle) {
        System.out.println("Читатель вернул книгу: " + bookTitle);
    }

    @Override
    public void orderBook(String bookTitle, Supplier supplier) {
        System.out.println("Библиотекарь заказал книгу у поставщика: " + bookTitle);
        supplier.bringBook(bookTitle);
    }

    @Override
    public void bringBook(String bookTitle) {
        System.out.println("Поставщик принес книгу: " + bookTitle);
    }

    @Override
    public void findBook(String bookTitle) {
        System.out.println("Администратор нашел книгу: " + bookTitle);
    }

    @Override
    public void issueBook(String bookTitle, Reader reader) {
        System.out.println("Администратор выдал книгу: " + bookTitle + " читателю");
        reader.takeBook(bookTitle);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор уведомил о просрочке возврата книги пользователю");
    }
}
