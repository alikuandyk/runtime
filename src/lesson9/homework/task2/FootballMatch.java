package lesson9.homework.task2;

import java.util.Scanner;

public class FootballMatch extends SportingCompetition {
    String firstTeam;
    String secondTeam;
    int numberOfFirstTeamPlayers;
    int numberOfSecondTeamPlayers;

    public FootballMatch(String name, double date, String place, String firstTeam, String secondTeam, int numberOfFirstTeamPlayers, int numberOfSecondTeamPlayers) {
        super(name, date, place);
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.numberOfFirstTeamPlayers = numberOfFirstTeamPlayers;
        this.numberOfSecondTeamPlayers = numberOfSecondTeamPlayers;
    }

    public String match(int firstGoal, int secondGoal) {

        return firstGoal > secondGoal ? firstTeam : secondTeam;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько голов забила команда " + firstTeam + "? ");
        int firstGoal = scanner.nextInt();

        System.out.print("Сколько голов забила команда " + secondTeam + "? ");
        int secondGoal = scanner.nextInt();

        System.out.print("Выигравшая команда - " + match(firstGoal, secondGoal));
    }
}
