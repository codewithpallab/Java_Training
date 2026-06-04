package BankAccount;

class Account {

    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}   

public class BankAccount {

    public static void main(String[] args) {

        Account acc = new Account();

        acc.accountHolder = "PALLAB";
        acc.balance = 22133234;

        acc.deposit(4332433);
        acc.withdraw(2323);

        acc.displayBalance();
    }
}
