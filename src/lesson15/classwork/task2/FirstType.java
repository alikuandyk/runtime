package lesson15.classwork.task2;

import java.math.BigDecimal;

public class FirstType extends TaxType{
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.divide(BigDecimal.valueOf(0.3));
    }
}
