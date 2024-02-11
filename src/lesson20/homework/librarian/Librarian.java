package lesson20.homework.librarian;

import lesson20.homework.book.BookHolder;
import lesson20.homework.supplier.Supplier;
import lesson20.homework.user.User;

public interface Librarian extends User, BookHolder {
    void orderBook(String title, Supplier supplier);
}
