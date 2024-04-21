package lesson39.homework.task1;

import lesson21.classwork.UserNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class UserService {
    private final Set<User> users = new HashSet<>();

    public void create(User user) throws ValidateException {
        if (user.getLogin() == null || user.getLogin().isEmpty() ||
                user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new ValidateException("Логин и пароль не могут быть пустыми");
        }

        for (User existingUser : users) {
            if (existingUser.getLogin().equals(user.getLogin())) {
                throw new ValidateException("Пользователь с таким логином уже существует");
            }
        }

        users.add(user);
    }

    public User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }

        throw new UserNotFoundException("Пользователь не найден");
    }

    public Set<User> getUsers() {
        return users;
    }
}
