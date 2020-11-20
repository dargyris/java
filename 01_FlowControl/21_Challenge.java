import java.util.Scanner;

class Challenge{

    public static void main ( String[] args ){

        Scanner theScanner = new Scanner( System.in );

        String[] myStringArr = {"", "", ""};
        int[] myIntArr = new int[3];

        for ( int i=0; i<3; i++ ){
            myStringArr[i] = theScanner.next();
            myIntArr[i] = theScanner.nextInt();
        }

        System.out.println( "====================================" );

        for ( int i=0; i<3; i++ ){
            System.out.printf( "%-15s%03d\n", myStringArr[i], myIntArr[i] );
        }

        System.out.println( "====================================" );

    }
}
