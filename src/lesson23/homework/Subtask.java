package lesson23.homework;


public class Subtask extends Task {
    private Epic epic;

    public Subtask(String name, String description, Epic epic) {
        super(name, description);
        this.epic = epic;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "epic=" + epic +
                '}';
    }
}
