package lesson3.homework.task1;

class Example {
    void time(int time) {
        if (0 >= time && time < 6) {
            System.out.println("Добрый ночь");
        } else if (6 >= time && time < 12) {
            System.out.println("Доброе утро");
        } else if (12 >= time && time < 18) {
            System.out.println("Добрый день");
        } else if (18 >= time && time < 24) {
            System.out.println("Добрый вечер");
        }
    }
}
