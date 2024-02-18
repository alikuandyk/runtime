package lesson23.homework;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Купить хлеб", "у нас закончилось хлеб");
        Task task2 = new Task("Выбросить мусор", "мусорное ведро переполнено");
        Task task3 = new Task("Приготовить ужин", "вечером придут гости");

        Epic epic1 = new Epic("Устроиться на работу", "описание");
        Subtask subtask1 = new Subtask("Собрать документы", "описание", epic1);
        Subtask subtask2 = new Subtask("Подготовиться к собес", "описание", epic1);

        Epic epic2 = new Epic("Поступить в вуз", "50 cent");
        Subtask subtask3 = new Subtask("Собрать документы (опять)", "че то там", epic2);
        Subtask subtask4 = new Subtask("Сдать экзамены", "тяжко", epic2);

        Epic epic3 = new Epic("Поднять Эль Примо на 35 ранг", "мне очень нравится этот персонаж");
        Subtask subtask5 = new Subtask("Поднять Эль Примо на 11 уровень", "на высоких рангов нужен макс лвл перса", epic3);
        Subtask subtask6 = new Subtask("Купить гаджеты и пассивки", "на высоких рангов у персонажа обязательно должен быть все гаджеты и пассивки", epic3);

        Manager Ali = new Manager();

        Ali.createTask(task1);
        Ali.createTask(task2);
        Ali.createTask(task3);

        Ali.createTask(epic1);
        Ali.createTask(epic2);
        Ali.createTask(epic3);

        Ali.createTask(subtask1);
        Ali.createTask(subtask2);
        Ali.createTask(subtask3);
        Ali.createTask(subtask4);
        Ali.createTask(subtask5);
        Ali.createTask(subtask6);

//        Ali.displayAllTasks();
//        Ali.displayTaskById(5);
//        Ali.deleteTaskById(5);
//        Ali.displayAllTasks();
        System.out.println(epic1.getTask());
    }
}
