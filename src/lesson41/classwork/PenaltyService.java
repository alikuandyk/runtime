package lesson41.classwork;

public class PenaltyService {
    public Categories calculatePenalty(int roadLimit, int driverSpeed) {
        int exceeding = driverSpeed - roadLimit;

        if (exceeding < 20) {
            return Categories.WITHOUT_PENALTY;
        } else if (exceeding < 40) {
            return Categories.FIRST_CATEGORY;
        } else if (exceeding < 60) {
            return Categories.SECOND_CATEGORY;
        } else if (exceeding < 80) {
            return Categories.THIRD_CATEGORY;
        } else {
            return Categories.FOURTH_CATEGORY;
        }
    }
}
