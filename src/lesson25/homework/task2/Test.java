package lesson25.homework.task2;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        WordRepetitionMapCreator creator = new WordRepetitionMapCreator();

        String s = "sentense in loWER caSE, SENTENsE IN UPper CAse.";

        Map<String, Integer> wordRepetitionMap = creator.createWordRepetitionMap(s);

        for (Map.Entry<String, Integer> entry : wordRepetitionMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
