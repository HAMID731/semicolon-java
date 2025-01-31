package Bank;
import java.util.Random;

public class Bank {
    Random rand = new Random();
    private final Account[] accounts;
    private int accountCount;

    public Bank() {
        accounts = new Account[100];
        accountCount = 0;
    }

    public Account createAccount(String firstName, String lastName, String pin) {
        int accountNumber = generateAccountNumber();
        String accountId = firstName + " " + lastName + "-" + accountNumber;
        Account account = new Account(accountId, pin);
        accounts[accountCount++] = account;
        return account;
    }

    private int generateAccountNumber() {
        int accountNumber;
        accountNumber = rand.nextInt(100);
        return accountNumber;
    }


}

