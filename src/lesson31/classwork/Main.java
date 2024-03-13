package lesson31.classwork;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IIOException {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Январь");
//        map.put(2, "Февраль");
//        map.put(3, "Март");
//        map.put(4, "Апрель");
//
//        try (Writer writer = new FileWriter("src/lesson31/classwork/task.txt")) {
//            for (Map.Entry<Integer, String> entry : map.entrySet()) {
//                writer.append(entry.getKey() + ", " + entry.getValue() + "\n");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        List<User> users = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            String userName = "user" + i;
            User user = new User(userName, 20 + i);
            for (int j = 1; j <= 3; j++) {
                Post post = new Post(userName + "Post" + j, LocalDateTime.now().plusDays(j));
                user.addPost(post);
            }
            users.add(user);
        }

        try (Writer writer = new FileWriter("src/lesson31/classwork/test.csv")) {
            writer.append("user_name,age,posts\n");
            for (User user : users) {
                writer.append(user.getName() + "," + user.getAge() + "," + user.getPosts().size() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // userName,age,postsCount
        // user1,20,3
        // user2,21,3
    }

}

class User {
    private String name;
    private int age;
    private List<Post> posts;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        posts = new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", posts=" + posts +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

class Post {
    private String title;
    private LocalDateTime createdAt;

    public Post(String title, LocalDateTime createdAt) {
        this.title = title;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}