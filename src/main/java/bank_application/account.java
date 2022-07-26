package bank_application;
import java.util.Scanner;

public class account {
    private int balance;
    private int previousTransaction;
    private String customerName;
    private int customerID;


    public account( String cName, int cID) {
        this.customerName = cName;
        this.customerID = cID;
    } 
    void diposit (int amount ){
        if(amount >=0){
            balance = balance + amount;
            previousTransaction =amount;
        }
    }
    void withdraw (int amount ){
        if(amount >=0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction >0){
            System.out.println("Deposited: "+previousTransaction );
        }
        else if (previousTransaction <0){
            System.out.println("withdrawn: "+Math.abs(previousTransaction));
        
        }
        else {
            System.out.println("No transcation has occured");
        }
        }
        void calculateInterestFixed(int years){
            double interestRate = .0185;
            double interest = (balance*interestRate*years )
        }
        
        void calculateInterestComp(int years){
            double interestRate = .0185;
            int i=0;
            double newBalance = balance;
            while (i < years){
                newBalance= newBalance*1.0185;
                i++; 
            }
            
            double interest = (newBalance - balance);
        }
        //int balanceP, int previousTransactionP, String customerNameP,
    // //if (balanceP<=0 || customerNameP == null){
    //     getError();
    // }
    
}
//https://www.youtube.com/watch?v=hqY6rKhRBzU 5:19