import java.io.IOException;
import java.util.Scanner;

class Withdraw{

    public static int withdraw( Account theAccount ){
        // int: If it succeeds returns 0. Otherwise -1.

        int status = -1;
        // success variable

        Scanner scanner = new Scanner ( System.in );
        int threeTries = 3;
        
        while ( threeTries > 0 ){
            Decorator.decorator();
            System.out.println( "\t====================================" );
            System.out.println( "\t\t~ Withdraw Funds ~" );
            System.out.println( "\t------------------------------------" );
            if ( theAccount.getCustomerName() == null ){
            // If: No account
                System.out.println( "\n\t>> No account present." );
                System.out.println( "\t====================================" );
                break;
            }
            if ( theAccount.getBalance() <= 0.d ) {
            // If: Balance <= 0
                System.out.println( "\n\tSorry. Insufficient funds." );
                System.out.println( "\t====================================" );
                break;
            }
            // If: There is Account and some money in
            System.out.println( "\tCurrent balance: " + theAccount.getBalance() );
            if ( threeTries < 3 ){
            // If: Prompt with error message after 1st failed attempt
                    System.out.println( "\n\tWrong input. Please try again." );
                    System.out.println( "\t( Rem. tries: " + threeTries + "/3 )" );
            }
            System.out.println( "\t------------------------------------\n" );
            System.out.println( "\tEnter amount to withdraw:\n" );
            System.out.print( "\t> " );
            boolean flag = scanner.hasNextDouble();
        
            if ( flag ){
            // If: The user entered a valid double
                double myDouble = scanner.nextDouble();
                if ( myDouble >= 0 ){
                    // If: The double is >= 0
                    if ( theAccount.getBalance() < myDouble ) {
                        //If: There is not enough money in the account to give
                        System.out.println( "\t------------------------------------\n" );
                        System.out.println( "\tSorry. Insufficient funds." );
                        System.out.println( "\t====================================" );
                        break;
                    } else {
                        // Else: There is enough money in the account to give.
                        theAccount.withdraw( myDouble );
                        System.out.println( "\t------------------------------------" );
                        System.out.println( "\tAmount: " + myDouble ); 
                        System.out.println( "\tsuccessfully withdrawn.");
                        System.out.println( "\tYour new Balance is: " + 
                            theAccount.getBalance() );
                        System.out.println( "\t====================================" );
                        break;
                    }
                }
            } 
            
            scanner.nextLine();     // Handling the extra \n
            threeTries--;           // Reducing while loop counter
        }
        if ( threeTries == 0 ){
            // Withdrawal unsuccessful. Print fail message.
            System.out.println( "\t------------------------------------" );
            System.out.println( "\tMax number of tries reached." );
            System.out.println( "\t====================================" );
        }
        // Wait 4 seconds printing wait characters.
        Relax.relax();
        return status;          // int: 0 if successful. -1 if not.
    }

}
