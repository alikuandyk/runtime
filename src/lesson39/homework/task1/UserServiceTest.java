package lesson39.homework.task1;

import lesson21.classwork.UserNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    UserService userService = new UserService();

    @Test
    void create_whenCorrectUserGiven_thenUserSaved() throws ValidateException {
        User user = new User("testLogin", "testPassword");

        userService.create(user);

        int expectedUserAmount = 1;
        Assertions.assertEquals(expectedUserAmount, userService.getUsers().size());
    }

    @Test
    void create_whenUserHasEmptyLoginAndPassword_thenThrowException() throws ValidateException {
        User user = new User("", "");

        Assertions.assertThrows(ValidateException.class, () -> {
            userService.create(user);
        });
    }

    @Test
    void create_whenUserAlreadyExistsWithThisLogin() throws ValidateException {
        User testUser = new User("testLogin", "testPassword");
        userService.create(testUser);

        User user = new User("testLogin", "testPassword");

        Assertions.assertThrows(ValidateException.class, () -> {
            userService.create(user);
        });
    }

    @Test
    void getExistingUser() throws ValidateException, UserNotFoundException {
        User expectedUser = new User("testLogin", "testPassword");
        userService.create(expectedUser);

        User actualUser = userService.getUserByLoginAndPassword("testLogin", "testPassword");

        Assertions.assertEquals(expectedUser, actualUser);
    }

    @Test
    void getNotExistingUser() throws ValidateException {
        User existingUser = new User("testLogin", "testPassword");
        userService.create(existingUser);

        Assertions.assertThrows(UserNotFoundException.class, () -> {
            userService.getUserByLoginAndPassword("wrongLogin", "wrongPassword");
        });
    }
}
