import java.io.IOException;
import java.util.Scanner;

class Deposit{

    public static int deposit( Account theAccount ){
        // int: If it succeeds returns 0. Otherwise -1.
        
        int status = -1;
        // success variable. 0 if successful.

        Scanner scanner = new Scanner ( System.in );
        int threeTries = 3;
        while ( threeTries > 0 ){
            Decorator.decorator();
            System.out.println( "\t====================================" );
            System.out.println( "\t\t~ Deposit Menu ~" );
            System.out.println( "\t------------------------------------" );
            if ( theAccount.getCustomerName() == null ){
                // If: There is no account
                System.out.println( "\n\t>> No account present." );
                System.out.println( "\t====================================" );
                break;
            }
            System.out.println( "\tCurrent balance: " + theAccount.getBalance() );
            if ( threeTries < 3 ){
                // If: Prompt with error message after 1st failed attempt.
                System.out.println( "\n\tWrong input. Please try again." );
                System.out.println( "\t( Rem. tries: " + threeTries + "/3 )" );
            }
            System.out.println( "\t------------------------------------\n" );
            System.out.println( "\tEnter amount to deposit:\n" );
            System.out.print( "\t> " ); 
            boolean isADouble = scanner.hasNextDouble();
       
            if ( isADouble ) {
                double myDouble = scanner.nextDouble();
                if ( myDouble >= 0 ){
                    theAccount.deposit( myDouble );
                    System.out.println( "\t------------------------------------" );
                    System.out.println( "\tAmount: " + myDouble ); 
                    System.out.println( "\thas been successfully deposited." );
                    System.out.println( "\tYour new balance is: " + 
                            theAccount.getBalance() );
                    System.out.println( "\t====================================" );
                    status = 0;
                    break;
                } else  {
                    scanner.nextLine();
                }
            } else {
                scanner.nextLine();
            }
            threeTries--;
        }
        if ( threeTries == 0 ){
            // Deposit unsuccessful. Print fail message.
            System.out.println( "\t------------------------------------" );
            System.out.println( "\tMax number of tries reached." );
            System.out.println( "\t====================================" );
            System.out.print( "\n\tReturning to main menu" );
        }
        // Wait 4 seconds and printing wait characters.
        Relax.relax();
        return status;      // int: 0 if successful. -1 if not.
    }

}
