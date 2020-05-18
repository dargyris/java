import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner theScanner = new Scanner( System.in );

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        System.out.print( "Enter number of elements >  " );
        int count = theScanner.nextInt();
        theScanner.nextLine();

        System.out.println( "\nPlease enter elements: " );
        int[] theIntArray = readIntegers( count );

        System.out.println( "You entered:" + Arrays.toString( theIntArray ) );
        System.out.println( "Minimum: " + findMin( theIntArray ) );

        interact();
    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i = 0; i < count; i++){
            array[i] = theScanner.nextInt();
            theScanner.nextLine();
        }
        return array;
    }

    private static int findMin( int[] array ){
        // int minimum = Integer.MAX_VALUE;
        int minimum = array[0];
        for( int i = 0; i < array.length - 1; i++){
            if( minimum > array[i+1] ){
                minimum = array[i+1];
            }
        }
        return minimum;
    }

    public static void interact(){
        try{
            int waitKey = System.in.read();
        }catch(IOException e){
            System.out.println( "Error reading from user." );
        }
    }

}
