import java.io.IOException;
import java.util.Scanner;

class hChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        minMax();


    }

    private static void minMax(){

        System.out.println( "Min/Max of input. " );
        
        int maxNumber = 0;
        int minNumber = 0;
        int counter = 0;
        Scanner myScanner = new Scanner( System.in );

        while ( true ){
            
            System.out.print( "Enter number: " );
            boolean isAnInt = myScanner.hasNextInt();
            
            if ( isAnInt ){
                counter += 1;
                int number = myScanner.nextInt();
                if ( counter == 1 ){
                    maxNumber = number;
                    minNumber = number;
                }
                if ( number > maxNumber ){
                    maxNumber = number;
                } 
                if ( number < minNumber ){
                    minNumber = number;
                }
                
            } else {
                System.out.println( "\nInvalid input." );
                System.out.println( counter + " valid numbers entered." );
                System.out.println( "Min: " + minNumber + 
                    "\tMax: " + maxNumber );
                break;
            }
            myScanner.nextLine();
        }

        myScanner.close();

    }


}
