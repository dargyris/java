import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner theScanner = new Scanner( System.in );

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        // Value types
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println( "myIntValue: " + myIntValue );
        System.out.println( "anotherIntValue: " + anotherIntValue );

        anotherIntValue++;
        System.out.println( "myIntValue: " + myIntValue );
        System.out.println( "anotherIntValue: " + anotherIntValue );

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println( "myIntArray: " + Arrays.toString( myIntArray ) );
        System.out.println( "anotherArray: " + Arrays.toString( anotherArray ) );

        anotherArray[0] = 1;
        System.out.println( "After change:" );
        System.out.println( "myIntArray: " + Arrays.toString( myIntArray ) );
        System.out.println( "anotherArray: " + Arrays.toString( anotherArray ) );

        anotherArray = new int[] { 4, 5, 6, 7, 8 };

        modifyArray( myIntArray );
        System.out.println( "After change 2:" );
        System.out.println( "myIntArray: " + Arrays.toString( myIntArray ) );
        System.out.println( "anotherArray: " + Arrays.toString( anotherArray ) );
//        interact();
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] { 1, 2, 3, 4, 5 };
    }

    public static void interact(){
        try{
            int waitKey = System.in.read();
        }catch( IOException e ){
            System.out.println( "Error reading from the user." );
        }
    }

}
