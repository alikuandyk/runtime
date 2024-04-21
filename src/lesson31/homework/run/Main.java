package lesson31.homework.run;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("число: ");
        int id = scanner.nextInt();
        try (Writer writer = new FileWriter("src/lesson31/homework/example.csv")){
//            writer.append("id,name,description,start_time,duration,epic_id\n");
//            writer.append("1,1,1,1,1,1\n");
//            writer.append("2,2,2,2,2,2\n");
//            writer.append("3,3,3,3,3,3\n");
//            writer.append("4,4,4,4,4,4\n");
            Reader reader = new FileReader("src/lesson31/homework.example.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);
            bufferedReader.readLine();

            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] array = line.split(",");

                if (Integer.parseInt(array[0]) == id) {
                    writer.append("");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        Task task1 = new Task("Купить хлеб", "у нас закончилось хлеб", "2024.03.13", "9");
//        Task task2 = new Task("Выбросить мусор", "мусорное ведро переполнено");
//        Task task3 = new Task("Приготовить ужин", "вечером придут гости");
//
//        Epic epic1 = new Epic("Устроиться на работу", "описание");
//        Subtask subtask1 = new Subtask("Собрать документы", "описание", epic1);
//        Subtask subtask2 = new Subtask("Подготовиться к собес", "описание", epic1);
//
//        Epic epic2 = new Epic("Поступить в вуз", "50 cent");
//        Subtask subtask3 = new Subtask("Собрать документы (опять)", "че то там", epic2);
//        Subtask subtask4 = new Subtask("Сдать экзамены", "тяжко", epic2);
//
//        Epic epic3 = new Epic("Поднять Эль Примо на 35 ранг", "мне очень нравится этот персонаж");
//        Subtask subtask5 = new Subtask("Поднять Эль Примо на 11 уровень", "на высоких рангов нужен макс лвл перса", epic3);
//        Subtask subtask6 = new Subtask("Купить гаджеты и пассивки", "на высоких рангов у персонажа обязательно должен быть все гаджеты и пассивки", epic3);
//
//        Manager Ali = new Manager();
//
//        Ali.createTask(task1);
//        Ali.createTask(task2);
//        Ali.createTask(task3);
//
//        Ali.createTask(epic1);
//        Ali.createTask(epic2);
//        Ali.createTask(epic3);
//
//        Ali.createTask(subtask1);
//        Ali.createTask(subtask2);
//        Ali.createTask(subtask3);
//        Ali.createTask(subtask4);
//        Ali.createTask(subtask5);
//        Ali.createTask(subtask6);
//
//        Ali.displayAllTasks();
//        Ali.displayTaskById(5);
//        Ali.deleteTaskById(5);
//        Ali.displayAllTasks();
    }
}
