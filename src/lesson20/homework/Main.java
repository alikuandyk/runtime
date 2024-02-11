package lesson20.homework;

import lesson20.homework.administrator.Administrator;
import lesson20.homework.librarian.Librarian;
import lesson20.homework.librarian.LibrarianImpl;
import lesson20.homework.reader.Reader;
import lesson20.homework.administrator.AdministratorImpl;
import lesson20.homework.reader.ReaderImpl;
import lesson20.homework.supplier.Supplier;
import lesson20.homework.supplier.SupplierImpl;

public class Main {
    public static void main(String[] args) {
//        Reader reader = new ReaderImpl("Вася");
//        Administrator administrator = new AdministratorImpl("Инна");
//
//        administrator.findBook("Властелин колец");
//        administrator.giveBook(reader);
//
//        System.out.println(reader.getName());

        Librarian librarian = new LibrarianImpl("Анна");
        Supplier supplier = new SupplierImpl("Алдияр");

        librarian.orderBook("Какая та книга", supplier);
        System.out.println(supplier.getBook());
    }
}
