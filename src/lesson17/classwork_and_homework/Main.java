package lesson17.classwork_and_homework;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("users=[");

//        classwork task
//        for (int i = 1; i <= 10; i++) {
//            builder.append(i).append(", ");
//        }
//        builder.delete(builder.length() - 2, builder.length());
//        builder.append("]");
//
//        System.out.println(builder);

        User[] users = {
                new User("Алдияр", 23, new Post[]{
                        new Post("aldiyar post 1", "2023-09-06"),
                        new Post("aldiyar post 2", "2023-09-06")
                }),
                new User("Данияр", 31, new Post[]{
                        new Post("Данияр post 1", "2023-09-06"),
                        new Post("Данияр post 2", "2023-09-06"),
                        new Post("Данияр post 3", "2023-09-06")
                }),
                new User("Аружан", 18, new Post[]{
                        new Post("Аружан post 1", "2023-09-06"),
                }),
                new User("Жулдыз", 25, new  Post[]{}),
        };


        for (int i = 0; i < users.length; i++) {
            builder.append("{name=")
                    .append(users[i].getName())
                    .append(", age=")
                    .append(users[i].getAge())
                    .append(", posts=[")
                    .append(displayPosts(users[i]))
                    .append("]")
                    .append("}, ");
        }

        builder.delete(builder.length() - 2, builder.length());
        builder.append("]");
        System.out.println(builder);
    }

    public static StringBuilder displayPosts(User user) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < user.getPosts().length; i++) {
            builder.append("{title=")
                    .append(user.getPosts()[i].getTitle())
                    .append(", postedAt=")
                    .append(user.getPosts()[i].getPostedAt())
                    .append("}, ");
        }
        return builder;
    }
}

class User {
    private String name;
    private int age;
    private Post[] posts;

    public User(String name, int age, Post[] posts) {
        this.name = name;
        this.age = age;
        this.posts = posts;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Post[] getPosts() {
        return posts;
    }
}


class Post{
    private String title;
    private String postedAt;

    public Post(String title, String postedAt) {
        this.title = title;
        this.postedAt = postedAt;
    }

    public String getTitle() {
        return title;
    }

    public String getPostedAt() {
        return postedAt;
    }
}
