import java.io.IOException;
import java.util.Scanner;

class InitMsg{

    public static void initMsg(Account theAccount){

        AccountStatus.accountStatus( theAccount );
        System.out.println( "\n\t>> Account successfully initialized." );

    }

}
