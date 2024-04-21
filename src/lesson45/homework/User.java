package lesson45.homework;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    long id;
    // users/999 404 NOT FOUND
    // Логин не может быть пустым, логин не может содержать пробелов
    // Если логин не прошел проверку выдаем статус 400 BAD REQUEST
    String login;
    List<Post> posts;

    public User(String login) {
        this.id = setUniqueId();
        this.login = login;
        this.posts = new ArrayList<>();
    }

    public static int uniqueId = 1;
    public static int setUniqueId() {
        return uniqueId++;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void setLogin(String login) {
        if (login == null || login.isEmpty() || login.contains(" ")) {
            throw new IllegalArgumentException("Логин не может быть пустым и не должен содержать пробелов");
        }
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public static int getUniqueId() {
        return uniqueId;
    }
}
