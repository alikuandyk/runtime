package lesson61.homework;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 2};
        int count = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                count++;
            }
        }

        System.out.println("Количество элементов, которые больше своих соседей: " + count);
    }
}

