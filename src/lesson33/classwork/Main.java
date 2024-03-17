package lesson33.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
//        WordEditor wordEditor = name -> name.substring(0, 1).toUpperCase() + name.substring(1);
//
//        String name = "alex";
//        name = wordEditor.capitalize(name);
//        System.out.println(name);

        UnaryOperator<List<Integer>> operator = list -> {
            List<Integer> list1 = new ArrayList<>();
            for (Integer i : list) {
                int num = i * 2;
                list1.add(num);
            }

            return list1;
        };

        System.out.println(operator.apply(List.of(1, 2, 3, 4, 5)));
    }
}

interface WordEditor {
    String capitalize(String string);
}
