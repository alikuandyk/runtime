package lesson25.homework.task6;

import java.util.*;

public class DeveloperProjectFinder {
    public static void main(String[] args) {
        Set<String> developers1 = new HashSet<>();
        developers1.add("ivan");
        developers1.add("ali");

        Set<String> developers2 = new HashSet<>();
        developers2.add("navi");
        developers2.add("tats");

        Set<String> developers3 = new HashSet<>();
        developers3.add("tats");
        developers3.add("vini");

        Map<String, Set<String>> map = new HashMap<>();
        map.put("job1", developers1);
        map.put("job2", developers2);
        map.put("job3", developers3);

        List<String> list = findDeveloperProject(map, "tats");
        System.out.println(list);
    }
    public static List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer){
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Set<String>> project : projects.entrySet()) {
            if (project.getValue().contains(developer)) {
                list.add(project.getKey());
            }
        }

        return list;
    }
}
