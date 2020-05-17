import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner theScanner = new Scanner(System.in);

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        int[] myIntegers = getIntegers(5);
        
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println( "Element " + i + " value: " + myIntegers[i] );
        }

        System.out.println( "Average: " + getAverage(myIntegers) );

        interact();
    }

    public static int[] getIntegers(int number){
        System.out.println( "Enter " + number + " integer values.\r" );
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = theScanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return (double) sum / (double)array.length;
    }

    public static void interact(){
        try{
            int waitKey = System.in.read();
        }catch(IOException e){
            System.out.println( "Error reading from the user" );
        }
    }

}
