import java.io.IOException;
import java.util.Scanner;

class Withdraw{

    public static Account withdraw( Account theAccount ){

        Scanner scanner = new Scanner ( System.in );
        int threeTries = 3;
        
        while ( threeTries > 0 ){
            Decorator.decorator();
            System.out.println( "\t====================================" );
            System.out.println( "\t\t~ Withdraw Funds ~" );
            System.out.println( "\t------------------------------------" );
            if ( theAccount.getCustomerName() == null ){
                System.out.println( "\n\t>> No account present." );
                System.out.println( "\t====================================" );
                break;
            }
            if ( theAccount.getBalance() <= 0.d ) {
                System.out.println( "\n\tSorry. Insufficient funds." );
                System.out.println( "\t====================================" );
                break;
            }
            System.out.println( "\tCurrent balance: " + theAccount.getBalance() );
            if ( threeTries < 3 ){
                    System.out.println( "\n\tWrong input. Please try again." );
                    System.out.println( "( Rem. tries: " + threeTries + "/3 )" );
            }
            System.out.println( "\t------------------------------------\n" );
            System.out.println( "\tEnter amount to withdraw:\n" );
            System.out.print( "\t> " );
            boolean flag = scanner.hasNextDouble();
        
            if ( flag ){
                double myDouble = scanner.nextDouble();
                if ( myDouble >= 0 ){
                    if ( theAccount.getBalance() < myDouble ) {
                        System.out.println( "\t------------------------------------\n" );
                        System.out.println( "\n\n\tSorry. Insufficient funds." );
                        System.out.println( "\t====================================" );
                        return theAccount;
                    } else {
                        theAccount.withdraw( myDouble );
                        System.out.println( "\t------------------------------------\n" );
                        System.out.println( "\tAmount: " + myDouble ); 
                        System.out.println( " successfully withdrawn.");
                        System.out.println( "\tYour new Balance is: " + 
                            theAccount.getBalance() );
                        System.out.println( "\t====================================" );
                        return theAccount;
                    }
                }
            }
            scanner.nextLine();
            threeTries--;
        }
        return theAccount;
    }

}
