import java.io.IOException;
import java.util.Scanner;

class gChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        System.out.println( "For sum: " + forMethod() );
        System.out.println( "****************************" );

        System.out.println( "While sum: " + whileMethod() );
        System.out.println( "****************************\n" );

    } // End of Main{}

    private static int forMethod(){

        System.out.println( "For: Please enter 10 numbers:" );

        int sum = 0;
        int validCounter = 0;
        Scanner myScanner = new Scanner( System.in );

        System.out.print( "No 1: " );
        boolean hasNextInt = myScanner.hasNextInt();
        
        for (int i = 0; i < 10 && hasNextInt; i++ ){
            validCounter += 1;
            sum += myScanner.nextInt();
            myScanner.nextLine();
            if ( i < 9 ){
                System.out.print( "No " + ( i + 2 ) + ": " );
                hasNextInt = myScanner.hasNextInt();
            }
        }

        System.out.println( "Total valid numbers: " + validCounter );
        myScanner.close();
        
        if ( hasNextInt ){
            return sum;
        }
        return -1;
    } // End of forMethod{}

    private static int whileMethod(){

        System.out.println( "\nWhile: Please enter 10 numbers:" );

        int sum = 0;
        int validCounter = 0;
        Scanner myWhileScanner = new Scanner( System.in );
        
        System.out.print( "No 1: " );
        boolean hasNextInt = myWhileScanner.hasNextInt();
        int i = 0;
        while ( i < 10 && hasNextInt ){
            validCounter += 1;
            sum += myWhileScanner.nextInt();
            myWhileScanner.nextLine();
            if ( i < 9 ){
                System.out.print( "No " + ( i + 2 ) + ": " );
                hasNextInt = myWhileScanner.hasNextInt();
            }
            i++;
        }

        System.out.println( "Total valid numbers: " + validCounter );

        myWhileScanner.close();
        
        if ( hasNextInt ){
            return sum;
        }
        return -1;
    } // End of whileMethod{}

}
