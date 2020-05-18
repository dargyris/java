import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner theScanner = new Scanner( System.in );

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        int[] myIntArray = getInts( 5 );
        int[] sorted = sortIntegers(myIntArray);
        printArray(sorted);
        interact();

    }

    public static int[] getInts( int capacity ){
        int[] array = new int[capacity];
        System.out.println( "Enter " + capacity + " integer values:\r" );
        for(int i=0; i<array.length; i++){
            array[i] = theScanner.nextInt();
        }
        return array;
    }

    public static void printArray( int[] array ){
        for(int i=0; i<array.length; i++){
            System.out.println( "Element " + i + " contents " + array[i] );
        }
    }

    public static int[] sortIntegers( int[] array ){
//        int[] sortedArray = new int[array.length];
//        for(int i =0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }
        // import java.util.Arrays;
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void interact(){
        try{
            int waitKey = System.in.read();
        }catch( IOException e ){
            System.out.println( "Error reading from the user." );
        }
    }


}
