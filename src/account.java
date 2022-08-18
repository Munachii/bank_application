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
            double interest = (balance*interestRate*years );
            double newBalance =(balance+interest);
            System.out.println("At 1.85% fixed interest you have gained "+interest+"over"+years+"years");
            System.out.println("Your new balance is" +newBalance);
        }

    void calculateInterestComp(int yearsC) {
        double interestRate = .0185;
        int i = 0;
        double interest = 0;
        while (i < yearsC) {
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
        System.out.println("E. Calculate fixed interest");
        System.out.println("G. Calculate compound interest");
        System.out.println("F. Exit");
    }

    do{
        System.out.println();
        System.out.println("Enter an option: ");
        char option1 = scanner.next().charAt(0);
        option = Character.toUpperCase(option1);
        System.out.println();
        

    
        switch (option) {
            case "A":
                System.out.println("===============================================");
                System.out.println("Balance = £"+ balance);
                System.out.println("===============================================");
                System.out.println();
            break;
            
            case "B":
                System.out.println("Enter an amount to deposit");
                int amount = scanner.nextInt();
                deposit(amount);
                System.out.println();
            break;

            case "C":
                System.out.println("Enter an amount to withdraw");
                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.println();
            break;
            case "D":
                System.out.println("===============================================");
                getPreviousTransaction();
                System.out.println("===============================================");
                System.out.println();
            break;
            case "E":
                System.out.println("Enter how many years of accrued intrest:");
                int years = scanner.nextInt();
                calculateInterestFixed(years);
            break;
            case "F":
                System.out.println("Enter how many years of accrued intrest:");
                int yearsC = scanner.nextInt();
                calculateInterestComp(yearsC);
            break;
            case "G":
                System.out.println("===============================================");
            break;
            default:
                System.out.println("Error: invalid option: Please enter A, B, C, D, E, F, G");
            break;
        }
    }while ( option != "G")
    System.out.println("Thank you for banking with us !");


}
// https://www.youtube.com/watch?v=hqY6rKhRBzU 
