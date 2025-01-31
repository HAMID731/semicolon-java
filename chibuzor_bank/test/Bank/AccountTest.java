package Bank;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    @Test
    public void depositMoney() {
        Account account = new Account("John Doe", "3242");
        account.deposit(4000);
        assertEquals(4000, account.getBalance());
    }

    @Test
    public void withdrawMoney() {
        Account account = new Account("John Doe", "3242");
        account.deposit(2000);
        boolean success = account.withdraw("3242", 300);
        assertTrue(success);
    }

    @Test
    public void getBalance() {
        Account account = new Account("John Doe", "3242");
        account.deposit(4000);
        account.withdraw("3242", 300);
        assertEquals(3700, account.getBalance());
    }
}
