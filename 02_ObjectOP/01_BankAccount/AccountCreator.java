import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class AccountCreator{

    public static Account accountCreator(Account theAccount){ 
        
        Scanner scanner = new Scanner ( System.in );
        
        Decorator.decorator();
        System.out.println( "\t====================================" );
        System.out.println( "\t\t~ New Account ~" );
        System.out.println( "\t------------------------------------" );

        System.out.println( "\tPlease enter your personal information:" );
        System.out.print( "\tName\t> " );
        while ( !scanner.hasNextLine() ){
            System.out.println( "\t> Wrong input. Please try again:\t> " );
        } 
        theAccount.setCustomerName( scanner.nextLine() );
        
        Random rand = new Random();
        theAccount.setAccountNumber( rand.nextInt(1000) );
        
        System.out.print( "\tE-mail\t> " );
        while ( !scanner.hasNextLine() ){
            System.out.println( "\n\t> Wrong input. Please try again:\n\t> " );
        }
        theAccount.setEmail( scanner.nextLine() );

        System.out.print( "\tTel.\t> " );
        while  ( !scanner.hasNextLine() ){
            System.out.println( "\n\t> Wrong input. Please try again:\n\t> " );
        }
        theAccount.setPhoneNumber( scanner.nextLine() );

        theAccount.setBalance( 0.d );
        return theAccount;
    }

}
