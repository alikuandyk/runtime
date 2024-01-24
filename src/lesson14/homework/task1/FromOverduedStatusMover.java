package lesson14.homework.task1;

public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE:
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
