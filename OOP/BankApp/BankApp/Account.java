package BankApp;

public class Account {


    private int balance;
    private final String pin;


    public Account(String correctPin) {
        this.pin = correctPin;

    }

    public static String createPin(String pin) {
        if (pin.length() != 4 || pin.isBlank()) {
            return "wrongPin";
        }
        return pin;
    }

    public int getBalance(String correctPin) {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) balance += amount;

    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean isPinCorrect(String correctPin) {
        return pin.equals(correctPin);
    }

}
