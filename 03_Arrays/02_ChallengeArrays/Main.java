import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner theScanner = new Scanner(System.in);

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        int myIntNumberCount = 3;
        int[] myIntArray = getIntegers( myIntNumberCount );
        System.out.println( "You entered: " );
        printArr( myIntArray );
        System.out.println();

        int[] mySortedIntArray = passArray(myIntArray);
        mySortedIntArray = arrSort( mySortedIntArray );
        
        System.out.println( "Passed element by element." );
        System.out.println( "After sorting original: " );
        printArr(myIntArray);
        System.out.println();

        System.out.println( "Sorted: " );
        printArr(mySortedIntArray);
        System.out.println();

        System.out.println( "Sort Array = myIntArray" );
        mySortedIntArray = myIntArray;
        mySortedIntArray = arrSort( mySortedIntArray );
        System.out.println( "After sorting original: " );
        printArr(myIntArray);
        System.out.println();

        System.out.println( "Sorted: " );
        printArr(mySortedIntArray);
        System.out.println();
        interact();

    }

    public static int[] getIntegers(int number){
        System.out.println( "Enter " + number + " int values.\n" );
        int[] valueArr = new int[number];

        for(int i = 0; i < valueArr.length; i++){
            valueArr[i] = theScanner.nextInt();
        }

        return valueArr;
    }

    public static int[] passArray(int[] array){
        int[] arrToPass = new int[array.length];
        for(int i = 0; i < array.length; i++){
            arrToPass[i] = array[i];
        }
        return arrToPass;
    }

    public static int[] arrSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < i; j++){
                if(array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static void printArr(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println( "Element " + i + ": " + array[i] );
        }
    }

    public static void interact(){
        try{
            int waitKey = System.in.read();
        }catch(IOException e){
            System.out.println( "Error reading from the user." );
        }
    }

}
