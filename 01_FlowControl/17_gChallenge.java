import java.io.IOException;
import java.util.Scanner;

class gChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
//        System.out.println( "For Ever Sum: " + forEverMethod() );
//        System.out.println( "****************************" );

        System.out.println( "For Sum: " + forMethod() );
        System.out.println( "****************************" );

//        System.out.println( "While Sum: " + whileMethod() );
//        System.out.println( "****************************\n" );

    }

    private static int forEverMethod(){

        System.out.println( "For: You must enter 10 valid numbers:" );

        int sum = 0;
        int validCounter = 0;
        Scanner myScanner = new Scanner( System.in );

        for ( ;; ){
            int order = validCounter + 1;
            System.out.print( "Enter number #" + order + ": " );

            boolean isAnInt = myScanner.hasNextInt();

            if ( isAnInt ){
                int number = myScanner.nextInt();
                validCounter++;
                sum += number;

                if ( validCounter == 10 ){
                    System.out.println( "Total valid numbers: " + validCounter );
                    myScanner.nextLine();
                    myScanner.close();
                    return sum;
                }

            } else {
                System.out.println( "Invalid number." );
            }

            myScanner.nextLine();
        }

    }

    private static int forMethod(){

        System.out.println( "For: You must enter 10 valid numbers:" );

        int sum = 0;
        int counter = 0;
        Scanner myScanner = new Scanner( System.in );

        for ( int validCounter = 0; validCounter < 10; ){
            int order = validCounter + 1;
            System.out.print( "Enter number #" + order + ": " );

            boolean isAnInt = myScanner.hasNextInt();

            if ( isAnInt ){
                int number = myScanner.nextInt();
                validCounter++;
                sum += number;

            } else {
                System.out.println( "Invalid number." );
            }
            
            counter = validCounter;
            myScanner.nextLine();
        }

        System.out.println( "Total valid numbers: " + counter );
        myScanner.close();
        return sum;

    }

    private static int whileMethod(){

        System.out.println( "\nWhile: You must enter 10 valid numbers: " );

        int sum = 0;
        int validCounter = 0;
        Scanner myWhileScanner = new Scanner( System.in );
        
        while ( true ){
            int order = validCounter + 1;
            System.out.print( "Enter number #" + order + ": " );

            boolean isAnInt = myWhileScanner.hasNextInt();

            if( isAnInt ){
                int number = myWhileScanner.nextInt();
                validCounter++;
                sum += number;
                if( validCounter == 10 ){
                    myWhileScanner.close();
                    System.out.println( "Total valid numbers: " + 
                        validCounter );        
                    return sum;
                }
            } else {
                System.out.println( "Invalid number." );
            }

            myWhileScanner.nextLine();
        }

    }

}
