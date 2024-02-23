package lesson25.classwork;

import java.util.Objects;

public class User implements Comparable<User> {
    int age;
    String name;
    double height;

    public User(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Double.compare(height, user.height) == 0 && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, height);
    }

    @Override
    public int compareTo(User o) {
        return Double.compare(height, o.height);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
