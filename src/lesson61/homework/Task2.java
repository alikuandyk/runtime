package lesson61.homework;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int shift = 2;
        int length = array.length;

        int[] shiftedArray = new int[length];

        for (int i = 0; i < length; i++) {
            shiftedArray[(i + length - shift) % length] = array[i];
        }

        System.out.print("Массив после сдвига: ");
        for (int i : shiftedArray) {
            System.out.print(i + " ");
        }
    }
}
