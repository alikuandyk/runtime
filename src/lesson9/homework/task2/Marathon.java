package lesson9.homework.task2;

public class Marathon extends SportingCompetition {
    String firstPlayer;
    String secondPlayer;
    String thirdPlayer;
    int distance;

    public Marathon(String name, double date, String place, int distance) {
        super(name, date, place);
        this.distance = distance;
    }
}
