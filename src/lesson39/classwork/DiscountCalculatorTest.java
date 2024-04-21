package lesson39.classwork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {
    DiscountCalculator discountCalculator = new DiscountCalculator();
    @Test
    public void shouldReturn107777_67When111111Given() {
        int price = 111_111;

        double actual = discountCalculator.calculateSum(price);

        double excepted = 107_777.67;
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldReturn193999_03When199999Given() {
        int price = 199_999;

        double actual = discountCalculator.calculateSum(price);

        double excepted = 193_999.03;
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldReturn194000When200000Given() {
        int price = 200_000;

        double actual = discountCalculator.calculateSum(price);

        double excepted = 194_000;
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void shouldThrowExceptionWhenNegativeNumberGiven() {
        int price = -1;
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> discountCalculator.calculateSum(price)
        );

        Assertions.assertEquals("че то там", exception.getMessage());
    }
}
