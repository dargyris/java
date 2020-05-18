import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Scanner theScanner;
        theScanner = new Scanner (System.in);
        int[] myVariable;

        myVariable = new int[10];
        int[] myArray = new int[10];

        // 1st method of init an array "inline"
        int[] myIntArray = { 1,2,3,4,5,6,7,8,9,10 };
        double[] myDoubleArray = new double[10];
        System.out.println( myIntArray[5] );

        // 2nd method of init an array
        int[] myIntArrB = new int[10];
        for(int i = 0; i < myIntArrB.length; i++){
            myIntArrB[i] = i*10;
        }
        
        printArray(myIntArrB);

    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println( "Element " + i + ", value is: "
                    + array[i] );
        }
    }

}
