package lesson25.homework.task5;

import java.util.*;

public class LessonsGetter {
    public static void main(String[] args) {
        List<String> monday = new ArrayList<>();
        monday.add("English");
        monday.add("Math");

        List<String> tuesday = new ArrayList<>();
        tuesday.add("History");
        tuesday.add("Math");

        Map<String, List<String>> timetable = new HashMap<>();
        timetable.put("monday", monday);
        timetable.put("tuesday", tuesday);

        List<String> list = getLessons(timetable);
        System.out.println(list);
    }

    public static List<String> getLessons(Map<String, List<String>> timetable) {
        List<String> list = new ArrayList<>();

        for (List<String> value : timetable.values()) {
            for (String s : value) {
                if (!(list.contains(s))) {
                    list.add(s);
                }
            }
        }

        return list;
    }
}
