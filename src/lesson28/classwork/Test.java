package lesson28.classwork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String sourceRoot = System.getProperty("user.dir");
        Path path = Path.of(sourceRoot + "/file_task");

        while (true) {
            printMenu();
            System.out.println("Выберите действие: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "ls" -> {
                    Path path1 = Path.of(sourceRoot + "/file_task");
                    for (Path p : path1) {
                        System.out.println(p.toString());
                    }
                }
                case "mkdir" -> {
                    System.out.println("Введите названия директорий: ");
                    String newDirectory = scanner.nextLine();

                    Files.createDirectory(Path.of(sourceRoot + "/" + newDirectory));
                }
                case "touch" -> {
                    System.out.println("Введите названия файла: ");
                    String newFile = scanner.nextLine();

                    Files.createFile(Path.of(sourceRoot + "/" + newFile));
                }
                case "rename" -> {
                    System.out.println("Введите названия директорий/файла: ");
                    String s = scanner.nextLine();

                    System.out.println("Введите новое названия: ");
                    String n = scanner.nextLine();

                    Path path1 = Path.of(sourceRoot + "/" + s);
                    Files.move(path1, path1.resolveSibling(n));
                }
                case "rm_file" -> {
                    System.out.println("Введите названия директорий/файла: ");
                    String s = scanner.nextLine();

                    Files.delete(Path.of(sourceRoot + "/" + s));
                }
                case "exit" -> {
                    return;
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("Что вы хотите сделать? ");
        System.out.println("ls - посмотреть содержимое директории.");
        System.out.println("mkdir - создать директорию.");
        System.out.println("touch - создать файл.");
        System.out.println("rename - переименовать директорию/файл.");
        System.out.println("rm_file - удалить файл.");
        System.out.println("exit - выход.");
        System.out.println();
    }
}
