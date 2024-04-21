package lesson39.homework.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void shouldNotBeBlockedWhenCreated() {
        BankAccount bankAccount = new BankAccount("firstName", "lastName");

        boolean isBlocked = bankAccount.isBlocked();

        Assertions.assertEquals(false, isBlocked);
    }

    @Test
    void shouldReturnZeroAmountAfterActivation() {
        BankAccount bankAccount = new BankAccount("firstName", "lastName");
        bankAccount.block();

        bankAccount.activate("KZT");

        int amount = bankAccount.getAmount();
        String currency = bankAccount.getCurrency();
        Assertions.assertEquals(0, amount);
        Assertions.assertEquals("KZT", currency);
    }

    @Test
    void shouldBeBlockedAfterBlockIsCalled() {
        BankAccount bankAccount = new BankAccount("firstName", "lastName");
        bankAccount.block();

        boolean isBlocked = bankAccount.isBlocked();

        Assertions.assertEquals(true, isBlocked);
    }

    @Test
    void shouldReturnFirstNameThenSecondName() {
        BankAccount bankAccount = new BankAccount("firstName", "lastName");

        String[] fullName = bankAccount.getFullName();
        String[] expectedFullName = {"firstName", "lastName"};

        Assertions.assertArrayEquals(expectedFullName, fullName);
    }

    @Test
    void shouldReturnNullAmountWhenNotActive() {
        BankAccount bankAccount = new BankAccount("firstName", "lastName");
        bankAccount.block();

        IllegalStateException exception = Assertions.assertThrows(IllegalStateException.class, bankAccount::getAmount);

        Assertions.assertEquals("Счёт не активирован.", exception.getMessage());
        Assertions.assertNull(bankAccount.getCurrency());
    }
}
