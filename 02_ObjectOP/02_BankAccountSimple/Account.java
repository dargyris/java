import java.io.IOException;
import java.util.Scanner;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void deposit ( double depositAmount ){
        this.balance += depositAmount;
        System.out.println( "Deposit of " + depositAmount + " made." );
        System.out.println( "New balance is " + this.balance );
    }

    public void withdrawal ( double withdrawalAmount ){
        if ( this.balance - withdrawalAmount < 0 ){
            System.out.println( "Only " + this.balance + " available." );
            System.out.println( "Withdrawal not processed." );
        } else  {
            this.balance -= withdrawalAmount;
            System.out.println( "Withdrawal of " + withdrawalAmount 
                    + " processed." );
            System.out.println( "Remaining balance = " + this.balance );
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
