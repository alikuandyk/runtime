package lesson20.homework.reader;

import lesson20.homework.administrator.Administrator;
import lesson20.homework.book.Book;
import lesson20.homework.book.BookHolder;
import lesson20.homework.user.User;

public interface Reader extends User, BookHolder {
    void takeBook(Book book, Administrator administrator);

    void returnBook(Administrator administrator);
}
