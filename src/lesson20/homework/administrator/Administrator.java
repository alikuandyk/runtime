package lesson20.homework.administrator;

import lesson20.homework.book.BookHolder;
import lesson20.homework.reader.Reader;
import lesson20.homework.user.User;

public interface Administrator extends User, BookHolder {
    void findBook(String title);

    void giveBook(Reader reader);

    void overdueNotification(Reader reader);
}
