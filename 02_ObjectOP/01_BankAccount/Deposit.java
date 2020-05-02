import java.io.IOException;
import java.util.Scanner;

class Deposit{

    public static Account deposit( Account theAccount ){

        Scanner scanner = new Scanner ( System.in );
        int threeTries = 3;
        while ( threeTries > 0 ){
            Decorator.decorator();
            System.out.println( "\t====================================" );
            System.out.println( "\t\t~ Deposit Menu ~" );
            System.out.println( "\t------------------------------------" );
            if ( theAccount.getCustomerName() == null ){
                System.out.println( "\n\t>> No account present." );
                System.out.println( "\t====================================" );
                break;
            }
            System.out.println( "\tCurrent balance: " + theAccount.getBalance() );
            if ( threeTries < 3 ){
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
                    System.out.println( "\n\n\tAmount: " + myDouble ); 
                    System.out.println( "\thas been successfully deposited." );
                    System.out.println( "\tYour new balance is: " + 
                            theAccount.getBalance() );
                    System.out.println( "\t====================================" );
                    return theAccount;
                } else  {
                    scanner.nextLine();
                }
            } else {
                scanner.nextLine();
            }
            threeTries--;
        }
        return theAccount;
    }

}
