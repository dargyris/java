import java.util.Scanner;

class Arrays {
    
    public static void main ( String[] args ){

        Scanner scanner = new Scanner( System.in );

        int[] evenIntArray = new int[4];
        int[] oddIntArray = new int[3];

        oddIntArray[0] = 0;
        oddIntArray[1] = 10;
        oddIntArray[2] = -10;

        printArray(oddIntArray);

        evenIntArray[0] = 50;
        evenIntArray[1] = 100;
        evenIntArray[2] = -50;
        evenIntArray[3] = 80;

        printArray( evenIntArray );

    }

    public static void printArray ( int[] myArray ){

        decorateOutput( myArray );

        for ( int i=0; i<myArray.length; i++ ){
            System.out.printf( " %3d ", myArray[i] );
        }

        decorateOutput( myArray );

    }

    public static void decorateOutput ( int[] myArray ){

        System.out.println();

        for ( int i=0; 
                i< 5 * myArray.length + 1; 
                i++ ){
            System.out.printf( "=" );
        }

        System.out.println();

    }
}
