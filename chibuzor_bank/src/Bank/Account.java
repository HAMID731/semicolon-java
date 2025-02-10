package Bank;

public class Account {
    private String accountId;
    private String pin;
    private double balance;

    public Account(String accountId, String pin) {
        this.accountId = accountId;
        this.pin = pin;
        this.balance = 0;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void getPin(String pin) {
        this.pin = pin;
    }

    public boolean withdraw(String pin, double amount) {
        if (this.pin.equals(pin) && amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
