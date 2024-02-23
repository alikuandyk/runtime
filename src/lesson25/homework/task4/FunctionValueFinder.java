package lesson25.homework.task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue){
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        if (functionMap.containsValue(requiredValue)) {
            return true;
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : sourceList) {
            int value = (5 * i) + 2;
            map.put(i, value);
        }

        return map;
    }
}
