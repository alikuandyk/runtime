package lesson33.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

//        FuncInterface funcInterface = list -> {
//            List<String> strings = new ArrayList<>();
//
//            for (Object object : list) {
//                strings.add(object.toString());
//            }
//
//            System.out.println(strings);
//        };
//
//        funcInterface.convert(integers);


        Function<List<?>, List<String>> function = x -> {
            List<String> convertedList = new ArrayList<>();

            for (Object object : x) {
                convertedList.add(object.toString());
            }

            return convertedList;
        };
        List<String> list = function.apply(integers);
        System.out.println(list);
    }
}

interface FuncInterface {
    void convert(List<?> list);
}
