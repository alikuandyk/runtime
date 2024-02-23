package lesson25.homework.task3;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public static Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();

        int i = 0;
        String s = null;
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            i = entry.getKey();
            s = entry.getValue();
            map.put(s, i);
        }

        return map;
    }
}
