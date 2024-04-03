package lesson38.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 3, 4, 6};
        System.out.println("До сортировки: " + Arrays.toString(numbers));
        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }

    static int binarySearch(int[] numbers, int target) {
        int isSorted = 0;
        isSorted = isSortedInAscendingOrder(numbers);
        isSorted = isSortedInDescendingOrder(numbers);

        switch (isSorted) {
            case 1 -> {
                return binarySearchAscending(numbers, target);
            }
            case -1 -> {
                return binarySearchDescending(numbers, target);
            }
            case 0 -> {
                return -1;
            }
        }
        return -1;
    }

    static int binarySearchAscending(int[] numbers, int target) {
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

    public static int binarySearchDescending(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            }

            if (numbers[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    static int isSortedInAscendingOrder(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

    static int isSortedInDescendingOrder(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                return 0;
            }
        }
        return -1;
    }
}
