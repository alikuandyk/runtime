package lesson14.homework.task1;

public class FromAvailableStatusMover extends BookMover {
//    проверка и переход книги из статуса архивед
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case BORROWED:
            case ARCHIVED:
                super.moveToStatus(book, requestedStatus);
                book.setStatus(requestedStatus);
                break;
            default:
                System.out.println("Перевод книги из статуса '" + book.getStatus() + "' в статус '" +
                        requestedStatus + "' невозможен");
        }
    }
}
