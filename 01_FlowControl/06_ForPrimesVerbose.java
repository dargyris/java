class ForPrimesVerbose{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        for ( int i = 10, counter = 0; i <= 50 && counter < 10; i++ ){
            if ( isPrimeBasic( i ) ) {
                System.out.println( counter + ". Prime: " + i );
                counter++;
            }

        }

        System.out.println( "*****************************************" );
        System.out.println( "*****************************************" );
        System.out.println( "*****************************************" );

        for ( int i = 10, counter = 0; i <= 50 && counter < 10; i++ ){
            if ( isPrimeOptimised( i ) ) {
                System.out.println( counter + ". Prime: " + i );
                counter++;
            }

        }

    } // End of main

    public static boolean isPrimeBasic(  
        int n){

        if ( n == 1 ){
            System.out.println( "Looping!" );
            return false;
        }
        
        for( int i = 2; i <= n / 2; i++ ){
            if( n % i == 0 ){
                System.out.println( "If Looping!" );
                return false;
            }
            System.out.println( "Looping!" );
        }
        
        return true;

    } // End of isPrimeBasic

    public static boolean isPrimeOptimised(  
        int n){

        if ( n == 1 ){
            System.out.println( "Looping!" );
            return false;
        }
        
        for( int i = 2; i <= ( long )Math.sqrt( n ); i++ ){
            if( n % i == 0 ){
                System.out.println( "If Looping!" );
                return false;
            }
            System.out.println( "Looping!" );
        }
        
        return true;

    } // End of isPrimeOptimised

}
