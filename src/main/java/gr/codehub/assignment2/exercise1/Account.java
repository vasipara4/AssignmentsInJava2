package gr.codehub.assignment2.exercise1;


public class Account {
    private String owner;
    private double balance = 0;
    private int numberOfTransactions = 0;

    public Account(String owner) {
        this.owner = owner;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            numberOfTransactions++;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            numberOfTransactions++;
            return true;
        }
        return false;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", numberOfTransactions=" + numberOfTransactions +
                '}';
    }


}
