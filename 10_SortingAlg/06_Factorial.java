import java.util.Scanner;

class Factorial {

    public static void main ( String[] args ){

        System.out.println( "FACTORIAL ALGORITHM" );
        System.out.println( " * 0! = 1" );

        Scanner scanner = new Scanner( System.in );
        System.out.println();
        System.out.print( "> " );
        int myNumber = scanner.nextInt();


        long myFactorial = factorialIterative( myNumber );
        System.out.println( "Factorial: " + myFactorial );
        System.out.println();

        myFactorial = factorialRecursive( myNumber );
        System.out.println( "Factorial: " + myFactorial );
        System.out.println();

    }

    public static long factorialIterative ( int myInt ){
        long myFactorial = 1;
        for ( int i=1; i<=myInt; i++ ){
            myFactorial *= i;
            System.out.println( "In Iterative factorial. Loop #" + i + "." );
        }
        return myFactorial;
    }

    public static long factorialRecursive ( int myInt ){

        if ( myInt > 1 ){
            System.out.println( "Recursive Factorial call: return factorial call." );
            return myInt*factorialRecursive(myInt-1);
        }

        System.out.println( "Recursive Factorial call: return 1." );
        return 1;       // Breaking condition, or Base case
                        // Ace of base
                        // Recursion starts to unwind.

    }

}
