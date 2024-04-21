package lesson41.classwork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PenaltyServiceTest {
    PenaltyService penaltyService = new PenaltyService();

    @Test
    void calculatePenalty_whenLimit120() {
        int roadLimit = 120;
        int firstDriverSpeed = 150;
        int secondDriverSpeed = 95;
        int thirdDriverSpeed = 100;

        Categories categories1 = penaltyService.calculatePenalty(roadLimit, firstDriverSpeed);
        Categories categories2 = penaltyService.calculatePenalty(roadLimit, secondDriverSpeed);
        Categories categories3 = penaltyService.calculatePenalty(roadLimit, thirdDriverSpeed);

        Assertions.assertEquals(Categories.FIRST_CATEGORY, categories1);
        Assertions.assertEquals(Categories.WITHOUT_PENALTY, categories2);
        Assertions.assertEquals(Categories.WITHOUT_PENALTY, categories3);
    }

    @Test
    void calculatePenalty_whenLimit60() {
        int roadLimit = 60;
        int firstDriverSpeed = 150;
        int secondDriverSpeed = 95;
        int thirdDriverSpeed = 100;

        Categories categories1 = penaltyService.calculatePenalty(roadLimit, firstDriverSpeed);
        Categories categories2 = penaltyService.calculatePenalty(roadLimit, secondDriverSpeed);
        Categories categories3 = penaltyService.calculatePenalty(roadLimit, thirdDriverSpeed);

        Assertions.assertEquals(Categories.FOURTH_CATEGORY, categories1);
        Assertions.assertEquals(Categories.FIRST_CATEGORY, categories2);
        Assertions.assertEquals(Categories.SECOND_CATEGORY, categories3);
    }
}
