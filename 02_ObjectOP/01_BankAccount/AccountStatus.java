import java.io.IOException;
import java.util.Scanner;

class AccountStatus{

    public static void accountStatus(Account theAccount){
        
        Decorator.decorator();
        System.out.println( "\t====================================" );
        System.out.println( "\t\t~ Account Status ~" );
        System.out.println( "\t------------------------------------" );
        if ( theAccount.getCustomerName() == null ){
            System.out.println( "\n\t>> No account present." );
            System.out.println( "\t====================================" );
        } else {
            System.out.println( "\t>> Account number\t: " + theAccount.getAccountNumber() ); 
            System.out.println( "\t>> Customer name\t: " + theAccount.getCustomerName() );
            System.out.println( "\t>> e-mail\t\t: " + theAccount.getEmail() );
            System.out.println( "\t>> Tel\t\t\t: " + theAccount.getPhoneNumber() + "\n" );
            System.out.println( "\t>> Balance\t\t: " + theAccount.getBalance() );
            System.out.println( "\t====================================" );
        }

    }

}
