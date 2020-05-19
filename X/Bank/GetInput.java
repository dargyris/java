import java.io.IOException;
import java.util.Scanner;

class GetInput{

    public static int getInput(  ){

        int intChoice = -1;
        Scanner in = new Scanner ( System.in );
        boolean isAnInt = in.hasNextInt();

        if  ( isAnInt ){
           intChoice = in.nextInt(); 
        } 

        if ( intChoice >=0 && intChoice <= 4 ){
            in.nextLine();
            return intChoice;
        } else  {
            in.nextLine();
            return -1;
        }

    }
    
}
