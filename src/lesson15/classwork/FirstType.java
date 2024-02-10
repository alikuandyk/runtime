package lesson15.classwork;

import java.math.BigDecimal;

public class FirstType extends TaxType{
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(100_000)) == -1) {
            return amount.divide(BigDecimal.valueOf(0.1));
        }
        return amount.divide(BigDecimal.valueOf(0.15));

    }
}
