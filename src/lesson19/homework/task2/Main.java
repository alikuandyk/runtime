package lesson19.homework.task2;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.takeBook("Игра Престолов");
        user.returnBook("Игра Престолов");
        user.orderBook("Мастер и Маргарита", user);
        user.findBook("Преступление и наказание");
        user.issueBook("Преступление и наказание", user);
        user.overdueNotification(user);
    }
}
