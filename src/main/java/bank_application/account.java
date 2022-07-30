package bank_application;

import java.util.Scanner;

public class account {
    private int balance;
    private int previousTransaction;
    private String customerName;
    private int customerID;

    public account(String cName, int cID) {
        this.customerName = cName;
        this.customerID = cID;
    }

    void diposit(int amount) {
        if (amount >= 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount >= 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("withdrawn: " + Math.abs(previousTransaction));

        } else {
            System.out.println("No transcation has occured");
        }
    }

    void calculateInterestFixed(int years){
            double interestRate = .0185;
            double interest = (balance*interestRate*years )
            double newBalance =(balance+interest);
            System.out.println("At 1.85% fixed interest you have gained "+interest+"over"+years+"years");
            System.out.println("Your new balance is" +newBalance);
        }

    void calculateInterestComp(int years) {
        double interestRate = .0185;
        int i = 0;
        double interest = 0;
        while (i < years) {
            interest = interest * interestRate;
            i++;
        }
        double newBalance = (balance + interest);
        System.out.println("At 1.85% compound interest you have gained " + interest + "over" + years + "years");
        System.out.println("Your new balance is" + newBalance);
    }

    void showMenu() {
        char option = "\0";
        Scanner scanner = new Scanner(System.in);
        Scanner(System.in);
        System.out.println("Welcome," + customerName + "I");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");
    }
    // int balanceP, int previousTransactionP, String customerNameP,
    // //if (balanceP<=0 || customerNameP == null){
    // getError();
    // }

}
// https://www.youtube.com/watch?v=hqY6rKhRBzU 5:19