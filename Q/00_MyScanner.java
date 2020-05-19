import java.io.IOException;
import java.util.Scanner;

class MyScanner{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        System.out.println( "1st method: " + firstMethod() );
        System.out.println( "****************************" );

        System.out.println( "2nd method: " + secondMethod() );
        System.out.println( "****************************\n" );

    } // End of Main{}

    private static int firstMethod(){

        System.out.print( "Enter a number:" );
        Scanner in = new Scanner( System.in );
        int number = 0;
        boolean isAnInt = in.hasNextInt();
        if( isAnInt ) {
            number = in.nextInt();
            in.nextLine();
        }
        in.close();
        return number;
    } // End of 1st method

    private static int secondMethod(){

        System.out.print( "Enter a number:" );
        Scanner in = new Scanner( System.in );
        int number = 0;
        boolean isAnInt = in.hasNextInt();
        if( isAnInt ) {
            number = in.nextInt();
            in.nextLine();
        }
        in.close();
        return number;
    } // End of 2nd method

}
