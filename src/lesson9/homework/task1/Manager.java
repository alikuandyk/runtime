package lesson9.homework.task1;

public class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, "Manager", salary);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Отдел: " + department);
    }
}
