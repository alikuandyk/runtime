package lesson9.homework.task1;

public class Developer extends Employee {
    String mainProgrammingLanguage;

    public Developer(String name, double salary, String mainProgrammingLanguage) {
        super(name, "Developer", salary);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Основной язык программирования: " + mainProgrammingLanguage);
    }
}
