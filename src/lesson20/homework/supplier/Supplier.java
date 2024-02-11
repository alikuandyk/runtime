package lesson20.homework.supplier;

import lesson20.homework.book.Book;
import lesson20.homework.book.BookHolder;
import lesson20.homework.librarian.Librarian;
import lesson20.homework.user.User;

public interface Supplier extends User, BookHolder {
    void deliveryBook(Book book, Librarian librarian);
    void displayStatus(Librarian librarian);
}
