package self.files_theme;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String sourceRoot = System.getProperty("user.dir");
        File file = new File(sourceRoot + "/src/lesson1");

        System.out.println(file.isDirectory());
    }
}
