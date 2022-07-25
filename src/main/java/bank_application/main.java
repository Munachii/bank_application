package bank_application;
import java.util.Scanner;
public class main {
    int i =0;
    int array[];
    public static String getError(){
        String error = "This is an invalid entry please try again";
        return(error);
    } 
    public void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to open up an account today (1) or check a current account? (2) ")
        String answer = scanner.nextLine();
        if (answer == "1"){
            System.out.println("enter name");
            String name = scanner.nextLine();

            }
        
        else if( answer == "2"){

        }
        else {
            getError();
        }

    }  
    }
       

