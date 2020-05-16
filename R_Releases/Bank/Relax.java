import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Relax {

    public static void relax(){
        
        System.out.print( "\n\t" );
        try {
            for ( int i = 0; i < 36; i++ ){
                System.out.print( ">" );
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch ( InterruptedException e ){
            e.printStackTrace();
        }

    }

}
