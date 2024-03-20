package lesson31.homework.junit;

import lesson31.homework.managers.ManagerImpl;
import lesson31.homework.tasks.Epic;
import lesson31.homework.tasks.Subtask;
import lesson31.homework.tasks.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerImplTest {
    ManagerImpl manager = new ManagerImpl();

    @Test
    public void testCreateTask() throws IOException {
        Task task = new Task("task",
                "description",
                LocalDateTime.of(2024, 3, 20, 17, 0),
                Duration.ofDays(9));

        manager.createTask(task);

        assertEquals(1, manager.getTasks().size());
        assertNotNull(manager.getTaskById(task.getId()));
    }

    @Test
    public void testUpdateTask() throws IOException {
        Task task = new Task("task",
                "description",
                LocalDateTime.of(2024, 3, 20, 17, 0),
                Duration.ofDays(9));

        manager.createTask(task);

        Task newTask = new Task("newtask",
                "newdescription",
                LocalDateTime.of(2024, 5, 20, 17, 0),
                Duration.ofDays(9));

        manager.update(task.getId(), newTask);

        assertEquals(newTask, manager.getTaskById(task.getId()));
    }

    @Test
    public void testDeleteTask() throws IOException {
        Task task = new Task("task",
                "description",
                LocalDateTime.of(2024, 3, 20, 17, 0),
                Duration.ofDays(9));

        manager.createTask(task);

        manager.delete(task.getId());

        assertNull(manager.getTaskById(task.getId()));
    }

    @Test
    public void testGetSubtasksByEpicId() throws IOException {
        Epic epic = new Epic("epic",
                "description",
                LocalDateTime.of(2024, 3, 20, 17, 0),
                Duration.ofDays(9),
                new ArrayList<>());

        manager.createEpic(epic);

        Subtask subtask = new Subtask("subtask",
                "description",
                LocalDateTime.of(2024, 3, 20, 17, 0),
                Duration.ofDays(2),
                epic);

        manager.createSubtask(subtask);

        epic.addSubtask(subtask);

        List<Subtask> subtasks = manager.getSubtasksByEpicId(epic.getId());

        assertTrue(subtasks.contains(subtask));
    }

    @Test
    public void testGetAllTasks() throws IOException {
        Task task = new Task("newtask",
                "newdescription",
                LocalDateTime.of(2024, 5, 20, 17, 0),
                Duration.ofDays(9));
        Epic epic = new Epic("epic",
                "description",
                LocalDateTime.of(2024, 3, 20, 17, 0),
                Duration.ofDays(9),
                new ArrayList<>());
        Subtask subtask = new Subtask("subtask",
                "description",
                LocalDateTime.of(2024, 3, 20, 17, 0),
                Duration.ofDays(2),
                epic);

        manager.createTask(task);
        manager.createEpic(epic);
        manager.createSubtask(subtask);

        List<Task> allTasks = manager.getAllTasks();

        assertTrue(allTasks.contains(task));
        assertTrue(allTasks.contains(epic));
        assertTrue(allTasks.contains(subtask));
    }

    @Test
    public void testRemoveAll() throws IOException {
        Task task = new Task("newtask",
                "newdescription",
                LocalDateTime.of(2024, 5, 20, 17, 0),
                Duration.ofDays(9));
        Epic epic = new Epic("epic",
                "description",
                LocalDateTime.of(2024, 3, 20, 17, 0),
                Duration.ofDays(9),
                new ArrayList<>());
        Subtask subtask = new Subtask("subtask",
                "description",
                LocalDateTime.of(2024, 3, 20, 17, 0),
                Duration.ofDays(2),
                epic);

        manager.createTask(task);
        manager.createEpic(epic);
        manager.createSubtask(subtask);

        manager.removeAll();
        
        assertTrue(manager.getAllTasks().isEmpty());
    }
}
