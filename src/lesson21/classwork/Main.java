package lesson21.classwork;

import java.nio.file.AccessDeniedException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        //Проверить логин и пароль
        try {
            User user = getUserByLoginAndPassword(login, password);
            validateUser(user);
            System.out.println("Доступ предоставлен");
        } catch (UserNotFoundException | AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("ali", "ali", "ali", 16);
        return new User[]{user1, user2};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) return user;
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 19) throw new AccessDeniedException("Возраст менее 18 лет");
    }
}
