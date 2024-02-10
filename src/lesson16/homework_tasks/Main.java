package lesson16.homework_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        проверка 8 задания
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите почту: ");
//        String email = scanner.nextLine();
//
//        System.out.print("Введите пароль: ");
//        String password = scanner.nextLine();
//
//        System.out.print("Проверка правильности почты: ");
//        if (Main.checkEmail(email) == true) {
//            System.out.println("правильно");
//        } else {
//            System.out.println("не правильно");
//            return;
//        }
//
//        System.out.print("Проверка правильности пароля: ");
//        if (Main.checkPassword(password) == true) {
//            System.out.println("правильно");
//        } else {
//            System.out.println("не правильно");
//            return;
//        }



//        task1
//        String days = "Понедельник,Вторник,Среда,Четверг,Пятница,Суббота,Воскресенье";
//
//        String[] daysArray = days.split(",");
//
//        for (String s : daysArray) {
//            System.out.println("Слово " + s + " содержит " + s.length() + " символов");
//        }



//        task2
//        String sentence = "Сегодня отличный день для программирования";
//
//        String[] sentenceArray = sentence.split(" ");
//        for (String s : sentenceArray) {
//            System.out.println("Слово " + s + " содержит " + s.length() + " символов");
//        }



//        task3
//        String text = "Java удивительный язык программирования";
//        int largest = Integer.MIN_VALUE;
//        String largestString = "";
//
//        String[] textArray = text.split(" ");
//        for (String s : textArray) {
//            if (s.length() > largest) {
//                largest = s.length();
//                largestString = s;
//            }
//        }
//
//        System.out.println("Самое длинное слово '" + largestString + "' - содержит " + largest + " символов");



//        task4
//        не выполнил, потому что тяжко было =)


//        task5
//        String phrase = "Пример строки для конвертации";
//
//        String[] phraseArray = phrase.split(" ");
//
//        for (int i = 0; i < phraseArray.length; i++) {
//            phraseArray[i] = phraseArray[i].substring(0, 1).toLowerCase() + phraseArray[i].substring(1);
//            phraseArray[i] = phraseArray[i].substring(0, 1) + phraseArray[i].substring(1).toUpperCase();
//        }
//
//        phrase = String.join("_", phraseArray);
//        System.out.println(phrase);



//        task7
//        String months = "ЯНВАРЬ-ФЕВРАЛЬ-МАРТ-АПРЕЛЬ-МАЙ-ИЮНЬ-ИЮЛЬ-АВГУСТ-СЕНТЯБРЬ-ОКТЯБРЬ-НОЯБРЬ-ДЕКАБРЬ";
//
//        String[] monthsArray = months.split("-");
//
//        for (int i = 0; i < monthsArray.length; i++) {
//            monthsArray[i] = monthsArray[i].substring(0, 1) + monthsArray[i].substring(1).toLowerCase();
//        }
//
//        int count = 1;
//        for (String s : monthsArray) {
//            System.out.println(count + ". " + s);
//            count++;
//        }
    }



//    task6
//    public int countVowels(String text) {
//        int vowelCount = 0;
//        text = text.toLowerCase();
//
//        for (int i = 0; i < text.length() - 1; i++) {
//            char c = text.charAt(i);
//
//            if (c == 'а' || c == 'е' || c == 'ё' || c == 'и' || c == 'о' || c == 'у' || c == 'ы' || c == 'э' || c == 'ю' || c == 'я') {
//                vowelCount++;
//            }
//        }
//
//        return vowelCount;
//    }



//    task8
    public static boolean checkPassword(String password) {
        boolean isTruePassword = false;

        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z"};

        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        if (password.length() < 8) {
            isTruePassword = false;
            return isTruePassword;
        } else {
            isTruePassword = true;
        }

        for (String letter : letters) {
            if (password.contains(letter)) {
                isTruePassword = true;
                break;
            } else {
                isTruePassword = false;
            }
        }

        for (String number : numbers) {
            if (password.contains(number)) {
                isTruePassword = true;
                break;
            } else {
                isTruePassword = false;
            }
        }

        return isTruePassword;
    }

    public static boolean checkEmail(String email) {
        if (email.contains("@") && !(email.contains(" "))) {
            return true;
        } return false;
    }
}
