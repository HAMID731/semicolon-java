package Bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void testCreateAccount() {
        Bank bank = new Bank();
        Account account = bank.createAccount("John", "Doe", "1234");

        assertNotNull(account, "Account should not be null");
        assertEquals("John Doe-0", account.getAccountId(), "Account ID should match");
        assertEquals("1234", account.getPin(), "PIN should match");
    }

    @Test
    public void testGenerateAccountNumber() {
        Bank bank = new Bank();
        int accountNumber = bank.generateAccountNumber();

        assertTrue(accountNumber >= 0 && accountNumber < 100, "Account number should be between 0 and 99");
    }
}
