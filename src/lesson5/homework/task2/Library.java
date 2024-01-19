package lesson5.homework.task2;

public class Library {
    Book availableBook;

    int maxRentalDays = 5;
    int penaltyPerDays = 1000;

    void lendBook(Person student, int days) {
        if (availableBook != null && student.borrowedBook == null) {
            student.borrowedBook = availableBook;
            availableBook = null;
//            int q = student.status == "Препод" ? student.rentalDays = 0 : student.rentalDays = days;
            if (student.status == "Препод") {
                student.rentalDays = 0;
            } else {
                student.rentalDays = days;
            }
        } else {
            System.out.println("Unsupported..");
        }
    }

    void acceptBook(Person person) {
        if (availableBook == null && person.borrowedBook != null) {
            person.history += person.borrowedBook.title + " ";
            availableBook = person.borrowedBook;
            availableBook.bookStatus += person.rentalDays;
            person.borrowedBook = null;
            if (person.status == "Препод") {
                System.out.println("Бесплатно");
            } else if (person.rentalDays > maxRentalDays) {
                int rentalDays = (person.rentalDays - maxRentalDays);
                int rental = (person.rentalDays - maxRentalDays) * penaltyPerDays;
                System.out.println("Студент опоздал на " + (rentalDays) + " days, штраф составляет " + (rental) + " тг");
            }
            person.rentalDays = 0;
        } else {
            System.out.println("Unsupported..");
        }
    }
}
