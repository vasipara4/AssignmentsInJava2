package gr.codehub.assignment2;

import gr.codehub.assignment2.exercise1.Account;
import gr.codehub.assignment2.exercise1.StoreAccount;

public class MainEx1 {
    public static void main(String[] args) {
        MainEx1.accountTester();
        System.out.println("_________");
        MainEx1.storeAccountTester();
    }


    public static void accountTester(){
        System.out.println("Creating a new Account with fields:");
        System.out.println("Owner: 'Nicky' ");
        Account test = new Account("Nicky");
        System.out.println(test);
        System.out.println("Deposit 10.6");
        System.out.println(test.deposit(10.6));
        System.out.println("Balance is: " + test.getBalance());
        System.out.println("Withdraw 10.7");
        System.out.println(test.withdraw(10.7));
        System.out.println("Balance is: " + test.getBalance());
        System.out.println("Withdraw 10.6");
        System.out.println(test.withdraw(10.6));
        System.out.println("Balance is: " + test.getBalance());
        System.out.println("Final State of the Account: ");
        System.out.println(test);

    }


    public static void storeAccountTester(){
        System.out.println("Creating a new Store Account with fields:");
        System.out.println("Owner: 'John', StoreName: 'Green Store', Account Category: 'abc'");
        StoreAccount test = new StoreAccount("John","Green Store", "abc");
        System.out.println(test);
        System.out.println("Setting the category to 'basic':");
        test.changeAccountCategory("basic");
        System.out.println(test);
        System.out.println("Deposit 314.5");
        System.out.println(test.deposit(314.5));
        System.out.println("Balance is: " + test.getBalance());
        System.out.println("Withdraw 300");
        System.out.println(test.withdraw(300));
        System.out.println("Balance is: " + test.getBalance());
        System.out.println("Number of transactions: " + test.getNumberOfTransactions());
        System.out.println("Final State:" + test);
        System.out.println("Creating a new Store Account:");
        System.out.println("Owner: 'Alex', StoreName: 'Yellow Store'");
        StoreAccount test1 = new StoreAccount("Alex","Yellow Store");
        System.out.println(test1);
        System.out.println("Creating a new Store Account:");
        System.out.println("StoreName: 'Black Coffee'");
        StoreAccount test2 = new StoreAccount("Yellow Store");
        System.out.println(test2);
    }
}
