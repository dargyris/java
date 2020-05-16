import java.io.IOException;
import java.util.Scanner;

class Interact{

    public static void interact(){

        try  {
            int waitInt = System.in.read();
        } catch  ( IOException e ){
            System.out.println( "Error reading from user." );
        }

    }

}
