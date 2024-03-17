package lesson31.homework.managers;

import lesson31.homework.status.Status;
import lesson31.homework.tasks.Epic;
import lesson31.homework.tasks.Subtask;
import lesson31.homework.tasks.Task;

import java.io.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileManagerImpl extends ManagerImpl {
    public void saveTask(Task task) throws IOException {
        try (Writer writer = new FileWriter("src/lesson31/homework/task.csv")){
            String id = String.valueOf(task.getId());
            String name = task.getName();
            String description = task.getDescription();
            String status = String.valueOf(task.getStatus());
            String startTime = String.valueOf(task.getStartTime());
            String duration = String.valueOf(task.getDuration());

            writer.append(id).append(",")
                    .append(name).append(",")
                    .append(description).append(",")
                    .append(status).append(",")
                    .append(startTime).append(",")
                    .append(duration).append(",")
                    .append(null).append("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ManagerImpl loadFromFile() throws IOException {
        ManagerImpl manager = new ManagerImpl();
        Reader reader = new FileReader("src/lesson31/homework/task.csv");
        BufferedReader bufferedReader = new BufferedReader(reader);
        bufferedReader.readLine();

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] strings = line.split(",");

            if (strings[6] == null) {
                int id = Integer.parseInt(strings[0]);
                String name = strings[1];
                String description = strings[2];
                Status status = Status.valueOf(strings[3]);

                String date = strings[5];
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
                LocalDateTime localDateTime = LocalDateTime.parse(date, dateTimeFormatter);

                String input = strings[6];
                Duration duration = Duration.parse(input);

                Task task = new Task(name, description, localDateTime, duration);
                task.setId(id);
                task.setStatus(status);

                manager.setTasks(id, task);
            } else {
                int id = Integer.parseInt(strings[0]);
                String name = strings[1];
                String description = strings[2];
                Status status = Status.valueOf(strings[3]);

                String date = strings[4];
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
                LocalDateTime localDateTime = LocalDateTime.parse(date, dateTimeFormatter);

                String input = strings[5];
                Duration duration = Duration.parse(input);

                int epicId = Integer.parseInt(strings[6]);
                Epic epic = new Epic(null, null, null, null, null);
                epic.setId(epicId);

                Subtask subtask = new Subtask(name, description, localDateTime, duration, epic);
                subtask.setId(id);
                subtask.setStatus(status);

                manager.setSubtasks(id, subtask);
            }
        }

        return manager;
    }

    public void loadFromFile(ManagerImpl manager) throws IOException {
//        Map<Integer, Task> taskMap = manager.getTasks();
//        Map<Integer, Epic> epicMap = manager.getEpics();
//        Map<Integer, Subtask> subtaskMap = manager.getSubtasks();
//
//        Writer writer = new FileWriter("src/lesson31/homework/task.csv");
//        for (Task task : taskMap.values()) {
//            String id = String.valueOf(task.getId());
//            String name = task.getName();
//            String description = task.getDescription();
//            String status = String.valueOf(task.getStatus());
//            String startTime = String.valueOf(task.getStartTime());
//            String duration = String.valueOf(task.getDuration());
//            String epicId = null;
//
//            writer.append(id).append(",")
//                    .append(name).append(",")
//                    .append(description).append(",")
//                    .append(status).append(",")
//                    .append(startTime).append(",")
//                    .append(duration).append(",")
//                    .append(epicId).append("\n");
//        }
//
//        for (Epic epic : epicMap.values()) {
//            String id = String.valueOf(epic.getId());
//            String name = epic.getName();
//            String description = epic.getDescription();
//            String status = String.valueOf(epic.getStatus());
//            String startTime = String.valueOf(epic.getStartTime());
//            String duration = String.valueOf(epic.getDuration());
//            String epicId = null;
//
//            writer.append(id).append(",")
//                    .append(name).append(",")
//                    .append(description).append(",")
//                    .append(status).append(",")
//                    .append(startTime).append(",")
//                    .append(duration).append(",")
//                    .append(epicId).append("\n");
//        }
//
//        for (Subtask subtask : subtaskMap.values()) {
//            String id = String.valueOf(subtask.getId());
//            String name = subtask.getName();
//            String description = subtask.getDescription();
//            String status = String.valueOf(subtask.getStatus());
//            String startTime = String.valueOf(subtask.getStartTime());
//            String duration = String.valueOf(subtask.getDuration());
//            String epicId = String.valueOf(subtask.getEpicId());
//
//            writer.append(id).append(",")
//                    .append(name).append(",")
//                    .append(description).append(",")
//                    .append(status).append(",")
//                    .append(startTime).append(",")
//                    .append(duration).append(",")
//                    .append(epicId).append("\n");
//        }
    }

    @Override
    public List<Task> getAllTasks() throws IOException {
        Reader reader = new FileReader("src/lesson31/homework/task.csv");
        BufferedReader bufferedReader = new BufferedReader(reader);
        bufferedReader.readLine();

        List<Task> tasks = new ArrayList<>();

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] array = line.split(",");
            int id = Integer.parseInt(array[0]);
            String name = array[1];
            String description = array[2];
            Status status = Status.valueOf(array[3]);

            String date = array[4];
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
            LocalDateTime localDateTime = LocalDateTime.parse(date, dateTimeFormatter);

            String input = array[5];
            Duration duration = Duration.parse(input);

            Task task = new Task(name, description, localDateTime, duration);
            task.setId(id);
            task.setStatus(status);
            tasks.add(task);
        }

        return tasks;
    }

    @Override
    public void removeAll() {
        try (Writer writer = new FileWriter("src/lesson31/homework/task.csv")){
            writer.append("");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Task getTaskById(int id) throws IOException {
        List<Task> tasks = getAllTasks();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                return tasks.get(i);
            }
        }
        return null;
    }

    @Override
    public void createTask(Task task) throws IOException {
        saveTask(task);
        super.createTask(task);
    }

    @Override
    public void update(int id, Task newTask) throws IOException {
        Reader reader = new FileReader("src/lesson31/homework/task.csv");
        Writer writer = new FileWriter("src/lesson31/homework/task.csv");
        BufferedReader bufferedReader = new BufferedReader(reader);
        bufferedReader.readLine();

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] array = line.split(",");

            if (Integer.parseInt(array[0]) == id) {
                String idd = String.valueOf(id);
                String name = newTask.getName();
                String description = newTask.getDescription();
                String startTime = String.valueOf(newTask.getStartTime());
                String duration = String.valueOf(newTask.getDuration());

                writer.append(idd).append(",").
                        append(name).append(",").
                        append(description).append(",").
                        append(startTime).append(",").
                        append(duration).append(",").
                        append(String.valueOf(null)).append("\n");
            }
        }
    }

    @Override
    public void delete(int id) throws IOException {
        List<Task> tasks = getAllTasks();

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getId() == id) {
                tasks.remove(task);
            }
        }

        for (Task task : tasks) {
            saveTask(task);
        }
    }

    @Override
    public List<Subtask> getSubtasksByEpicId(int id) throws IOException {
        List<Subtask> subtasks = new ArrayList<>();

        Reader reader = new FileReader("src/lesson31/homework/task.csv");
        BufferedReader bufferedReader = new BufferedReader(reader);
        bufferedReader.readLine();

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] array = line.split(",");
            Epic epic = null;

            if (Integer.parseInt(array[0]) == id) {
                int idd = Integer.parseInt(array[0]);
                String name = array[1];
                String description = array[2];
                Status status = Status.valueOf(array[3]);

                String date = array[4];
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
                LocalDateTime localDateTime = LocalDateTime.parse(date, dateTimeFormatter);

                String input = array[5];
                Duration duration = Duration.parse(input);

                epic = new Epic(name, description, localDateTime, duration, null);
                epic.setStatus(status);
            }


            if (Integer.parseInt(array[7]) == id) {
                int idd = Integer.parseInt(array[0]);
                String name = array[1];
                String description = array[2];
                Status status = Status.valueOf(array[3]);

                String date = array[4];
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
                LocalDateTime localDateTime = LocalDateTime.parse(date, dateTimeFormatter);

                String input = array[5];
                Duration duration = Duration.parse(input);

                Subtask subtask = new Subtask(name, description, localDateTime, duration, epic);
                subtasks.add(subtask);
                subtask.setStatus(status);
            }

        }

        return subtasks;
    }
}
