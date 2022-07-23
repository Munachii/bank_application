package bank_application;
import java.util.Scanner;

public class account {
    private int balance;
    private int previousTransaction;
    private String customerName;
    private int customerID;


public account( String customerNameP, int CustomerIDP) {
    this.customerName = customerNameP;
    this.customerID = CustomerIDP;
}    
    //int balanceP, int previousTransactionP, String customerNameP,
// //if (balanceP<=0 || customerNameP == null){
//     getError();
// }
    public String getError(){
        String error = "This is an invalid entry please try again";
        return(error);
    }
}
//https://www.youtube.com/watch?v=hqY6rKhRBzU 5:19