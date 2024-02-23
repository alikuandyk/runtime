package lesson25.homework.task2;

import java.util.*;

public class WordRepetitionMapCreator {
    public static Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] words = sentence.toLowerCase().split(" ");

        set.addAll(List.of(words));

        String test = null;
        int count = 0;
        for (String i : set) {
            count = 0;
            test = i;
            for (String j : words) {
                if (i.equals(j)) {
                    count++;
                }
            }
            map.put(test, count);
        }

        return map;
    }
}
