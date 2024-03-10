package lesson30.classwork.code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<String> readFile(String file) {
        String dir = System.getProperty("user.dir");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dir + "/src/lesson30/classwork/resources/" + file));
            bufferedReader.readLine();

            List<String> list = new ArrayList<>();
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                list.add(line);
            }
            return list;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    public static List<String> readYearFile() {
        String dir = System.getProperty("user.dir");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dir + "/src/lesson30/classwork/resources/y.2021.csv"));
            bufferedReader.readLine();

            List<String> list = new ArrayList<>();
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                list.add(line);
            }
            return list;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }
}
