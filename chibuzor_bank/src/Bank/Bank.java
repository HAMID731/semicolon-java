package Bank;
import java.util.ArrayList;
import java.util.Random;

public class Bank {
    Random rand = new Random();
    private final ArrayList<String> accounts;
    private int accountCount;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.accountCount = 0;
    }

    public Account createAccount(String firstName, String lastName, String pin) {
        int accountNumber = generateAccountNumber();
        String accountId = firstName + " " + lastName + "-" + accountNumber;
        Account account = new Account(accountId, pin);
        accounts.set(accountCount++, String.valueOf(account));
        return account;
    }

    int generateAccountNumber() {
        int accountNumber;
        accountNumber = rand.nextInt(100);
        return accountNumber;
    }



}
