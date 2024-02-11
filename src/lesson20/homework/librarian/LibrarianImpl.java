package lesson20.homework.librarian;

import lesson20.homework.book.Book;
import lesson20.homework.supplier.Supplier;
import lesson20.homework.user.AbstractUser;

public class LibrarianImpl extends AbstractUser implements Librarian {
    private Book book;

    public LibrarianImpl(String name) {
        super(name);
    }

    @Override
    public void orderBook(String title, Supplier supplier) {
        System.out.printf("Библиотекарь %s, заказывает книгу '%s', у поставщика %s\n"
        , name, title, supplier.getName());
        supplier.deliveryBook(new Book(title, "author"), this);
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
