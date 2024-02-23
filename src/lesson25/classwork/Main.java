package lesson25.classwork;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<User> userComparator = new UserAgeComparator();
        Set<User> set = new TreeSet<>(userComparator);

        User user1 = new User(19, "Ali", 175);
        User user2 = new User(18, "Yersaiyn", 176);
        User user3 = new User(23, "Alisher", 183);

        set.add(user1);
        set.add(user2);
        set.add(user3);

        System.out.println(set);
    }
}
