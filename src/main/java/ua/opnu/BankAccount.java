package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    void deposit(double amount) {
        if(amount>0)
        balance = balance + amount;
    }

    double getBalance() {
        return this.balance;

    }

    boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance >= amount + transactionFee) {
            balance -= amount + transactionFee;
            return true;
        }
        return false;
    }


    boolean transfer(BankAccount receiver, double amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance >= amount + transactionFee) {
            balance -= amount + transactionFee;
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}