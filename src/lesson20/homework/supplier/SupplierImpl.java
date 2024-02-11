package lesson20.homework.supplier;

import lesson20.homework.DeliveryStatus;
import lesson20.homework.book.Book;
import lesson20.homework.librarian.Librarian;
import lesson20.homework.user.AbstractUser;

public class SupplierImpl extends AbstractUser implements Supplier {
    private Book book;
    private DeliveryStatus deliveryStatus;

    public SupplierImpl(String name) {
        super(name);
    }

    public void displayStatus(Librarian librarian) {
        switch (deliveryStatus) {
            case IN_PREPARATION_FOR_SENDING -> System.out.println("в подготовке отправки...");
            case DURING_THE_DELIVERY_PROCESS -> System.out.printf("поставщик %s получил книгу, в процессе доставки...\n", getName());
            case DELIVERED -> System.out.printf("поставщик %s, доставил заказ книги '%s', библиотекарю %s\n"
                    , getName(), book.getTitle(), librarian.getName());
        }
    }

    @Override
    public void deliveryBook(Book book, Librarian librarian) {
        deliveryStatus = DeliveryStatus.IN_PREPARATION_FOR_SENDING;
        System.out.print("Статус заказа: "); displayStatus(librarian);
        setBook(null);

        deliveryStatus = DeliveryStatus.DURING_THE_DELIVERY_PROCESS;
        System.out.print("Статус заказа: "); displayStatus(librarian);
        setBook(book);

        deliveryStatus = DeliveryStatus.DELIVERED;
        System.out.print("Статус заказа: "); displayStatus(librarian);
        librarian.setBook(this.book);
        setBook(null);
        deliveryStatus = null;
    }

    @Override
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public Book getBook() {
        return book;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
