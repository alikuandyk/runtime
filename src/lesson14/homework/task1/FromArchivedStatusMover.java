package lesson14.homework.task1;

public class FromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.AVAILABLE) {
            super.moveToStatus(book, requestedStatus);
            book.setStatus(requestedStatus);
        } else {
            System.out.println("Перевод книги из статуса '" + book.getStatus() + "' в статус '" +
                    requestedStatus + "' невозможен");
        }
    }
}
