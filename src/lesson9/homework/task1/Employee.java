package lesson9.homework.task1;

public class Employee {
    String name;
    String position;
    double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Информация о сотруднике");
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Зарплата: " + salary);
    }
}
