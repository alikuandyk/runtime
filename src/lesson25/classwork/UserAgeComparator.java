package lesson25.classwork;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.age - o2.age;
    }
}
