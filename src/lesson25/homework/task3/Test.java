package lesson25.homework.task3;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        KeyValueSwapper swapper = new KeyValueSwapper();

        map.put(1, "one");
        map.put(2, "two");
        map.put(10, "ten");

        Map<String, Integer> map1 = swapper.swap(map);

        System.out.println(map1);
    }
}
