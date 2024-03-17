package lesson33.homework;

public class Task1 {
    public static void main(String[] args) {
        String string = "Интернет – это система связанных между собой сетей. Если визуально сравнить мировую сеть с деревом, то в роли ствола выступают толстые кабели из оптоволокна, проложенные под землей и по дну океанов.";

        NumbersOfWords numbersOfWords = str -> {
            String[] strings = str.split("\\s+");
//            System.out.println(Arrays.toString(strings));
            return strings.length;
        };

        System.out.println(numbersOfWords.numbersOfWordsInString(string));
    }
}

interface NumbersOfWords {
    int numbersOfWordsInString(String string);
}
