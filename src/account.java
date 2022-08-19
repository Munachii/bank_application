

import java.util.Scanner;

public class account {
    private double balance = 0;
    private double previousTransaction;
    private String customerName;
    private String customerID;

    public account(String cName, String cID) {
        this.customerName = cName;
        this.customerID = cID;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println("You have deposited " + amount + ". Your balanace is now " + balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            if (amount >= 0) {
                balance = balance - amount;
                previousTransaction = -amount;
                System.out.println("You have withdrawn " + amount + ". Your balanace is now " + balance);
            }
        } else {
            System.out.println("You don't have enough funds for to complete this transaction");
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

    void calculateInterestFixed(int years) {
        double interestRate = 0.0185;
        double interest = (balance * interestRate * years);
        double newBalance = (balance + interest);
        System.out.println("At 1.85% fixed interest you have gained £" + interest + " over " + years + " years");
        System.out.println("Your new balance is: " + newBalance);
    }

    void calculateInterestComp(int yearsC) {
        double interestRatePerAnnum = 1.0185;
        double interestRateInXyrs = Math.pow(interestRatePerAnnum, yearsC);
        double newBalance = balance * interestRateInXyrs;
        double interest = newBalance - balance;
        System.out.println("At 1.85% compound interest you have gained £" + interest + " over " + yearsC + " years");
        System.out.println("Your new balance is: " + newBalance);
    }

    void showMenu() {
        String option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Welcome," + customerName);
            System.out.println("Your ID is: " + customerID);
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("A. Check your balance");
            System.out.println("B. Make a deposit");
            System.out.println("C. Make a withdrawal");
            System.out.println("D. View previous transaction");
            System.out.println("E. Calculate fixed interest");
            System.out.println("F. Calculate compound interest");
            System.out.println("G. Exit");
            option = scanner.next();
            option = option.toUpperCase();
            System.out.println();

            switch (option) {
                case "A":
                    System.out.println("===============================================");
                    System.out.println("Balance = £" + balance);
                    System.out.println("===============================================");
                    System.out.println("");
                    break;

                case "B":
                    System.out.println("Enter an amount to deposit");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("===============================================");
                    break;

                case "C":
                    System.out.println("Enter an amount to withdraw");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    System.out.println("===============================================");
                    break;
                case "D":

                    getPreviousTransaction();
                    System.out.println();
                    System.out.println("===============================================");
                    break;
                case "E":
                    if (balance < 1) {
                        System.out.println(
                                "Your bank account is too low for this option. Please deposit more money and try again ");
                    } else {
                        System.out.println("Enter how many years of accrued intrest:");
                        int years = scanner.nextInt();
                        calculateInterestFixed(years);
                        System.out.println("===============================================");
                        break;
                    }
                case "F":
                    if (balance < 1) {
                        System.out.println(
                                "Your bank account is too low for this option. Please deposit more money and try again ");
                    } else {
                        System.out.println("Enter how many years of accrued intrest:");
                        int yearsC = scanner.nextInt();
                        calculateInterestComp(yearsC);
                        System.out.println("===============================================");
                        break;
                    }
                case "G":
                    System.out.println("===============================================");
                    option = "G";
                    break;
                default:
                    System.out.println("Error: invalid option: Please enter A, B, C, D, E, F, G");
                    System.out.println("===============================================");

                    break;
            }
        } while (option != "G");
        System.out.println("Thank you for banking with us !");

    }
}
// https://www.youtube.com/watch?v=hqY6rKhRBzU
