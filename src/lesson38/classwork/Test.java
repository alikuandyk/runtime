package lesson38.classwork;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 3, 4, 6};
        System.out.println("До сортировки: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }

    static void selectionSort(int[] numbers) {
        for (int round = 0; round < numbers.length; round++) {
            int minIdx = round;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < numbers[minIdx]) {
                    minIdx = i;
                }
            }
            if (minIdx != round) {
                int temp = numbers[minIdx];
                numbers[round] = numbers[minIdx];
                numbers[minIdx] = temp;
            }
        }
    }


    static void bubbleSort(int[] numbers) {
        boolean isNotSorted = true;
        int round = 0;
        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 0; i < numbers.length - 1 - round; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isNotSorted = true;
                }
            }
            round++;
        }
    }

//    static void bubbleSort(int[] numbers) {
//        for (int round = 0; round < numbers.length; round++) {
//            boolean isSorted = true;
//            for (int i = 0; i < numbers.length - 1 - round; i++) {
//                if (numbers[i] > numbers[i + 1]) {
//                    int temp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = temp;
//                    isSorted = false;
//                }
//            }
//            if (isSorted) {
//                return;
//            }
//        }
//    }

    static int binarySearch(int[] numbers, int target) {
        boolean isSorted = isSorted(numbers);
        if (!isSorted) {
            selectionSort(numbers);
        }
        
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (target > numbers[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    static boolean isSorted(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
