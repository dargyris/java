import java.io.IOException;
import java.util.Scanner;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account (){
        this("5678", 2.50, "Default name", "Default addreess", "Default phone");
        System.out.println( "Empty constructor called." );
    }

    public Account ( String number, 
                     double balance, 
                     String customerName, 
                     String customerEmail,
                     String customerPhone ){
        System.out.println( "Account constructor with parameters. " );

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void deposit ( double depositAmount ){
        this.balance += depositAmount;
        System.out.print( "\nDeposit of " + depositAmount + " made." );
        System.out.print( " New balance is " + this.balance );
    }

    public void withdrawal ( double withdrawalAmount ){
        if ( this.balance - withdrawalAmount < 0 ){
            System.out.print( "\nOnly " + this.balance + " available." );
            System.out.print( " Withdrawal not processed." );
        } else  {
            this.balance -= withdrawalAmount;
            System.out.print( "\nWithdrawal of " + withdrawalAmount 
                    + " processed." );
            System.out.print( " Remaining balance = " + this.balance );
        }
    }

    public String getNumber (  ){
        return number;
    }

    public void setNumber ( String number ){
        this.number = number;
    }

    public double getBalance (  ){
        return balance;
    }

    public void setBalance ( double balance ){
        this.balance = balance;
    }

    public String getCustomerName (  ){
        return customerName;
    }

    public void setCustomerName ( String customerName ){
        this.customerName = customerName;
    }

    public String getCustomerEmail (  ){
        return this.customerEmail;
    }

    public void setCustomerEmail ( String customerEmail ){
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone (  ){
        return this.customerPhone;
    }

    public void setCustomerPhone ( String customerPhone ){
        this.customerPhone = customerPhone;
    }

}
