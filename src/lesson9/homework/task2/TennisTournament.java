package lesson9.homework.task2;

public class TennisTournament extends SportingCompetition {
    String typeOfCort;

    public TennisTournament(String name, double date, String place, String typeOfCort) {
        super(name, date, place);
        this.typeOfCort = typeOfCort;
    }
}
