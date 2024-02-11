package lesson20.homework.reader;

import lesson20.homework.administrator.Administrator;
import lesson20.homework.book.Book;
import lesson20.homework.user.AbstractUser;

public class ReaderImpl extends AbstractUser implements Reader {
    private Book book;

    public ReaderImpl(String name) {
        super(name);
    }

    @Override
    public void takeBook(Book book, Administrator administrator) {
        System.out.printf("Читатель %s берет книгу '%s' у администратора %s\n",
                name, book.getTitle(), administrator.getName());
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.printf("Читатель %s возвращает книгу %s администратору %s",
                name, book.getTitle(), administrator.getName());
        administrator.setBook(book);
        book = null;
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
