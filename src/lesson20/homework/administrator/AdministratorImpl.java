package lesson20.homework.administrator;

import lesson20.homework.reader.Reader;
import lesson20.homework.user.AbstractUser;
import lesson20.homework.book.Book;

public class AdministratorImpl extends AbstractUser implements Administrator {
    private Book book;

    public AdministratorImpl(String name) {
        super(name);
    }

    @Override
    public void findBook(String title) {
        book = new Book(title, "");
        System.out.println("Нашли книгу " + title);
    }

    @Override
    public void giveBook(Reader reader) {
        System.out.printf("Администратор %s передал книгу %s читателю %s\n",
                name, book.getTitle(), reader.getName());
        reader.takeBook(book, this);
        reader.setBook(book);
        book = null;
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.printf("Администратор %s уведомляет читателя %s\n",
                name, reader.getName());
    }

    @Override
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public Book getBook() {
        return book;
    }
}
