package lesson23.homework;

public class GeneratorId {
    private static Integer uniqueId = 1;

    public static Integer getUniqueId() {
        return uniqueId++;
    }
}
