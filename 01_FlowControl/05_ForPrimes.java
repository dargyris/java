class ForPrimes{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        for ( int i = 10, counter = 0; i <= 50 && counter < 10; i++ ){
            if ( isPrime( i ) ) {
                System.out.println( counter + ". Prime: " + i );
                counter++;
            }
        }

    }

    public static boolean isPrime(  
        int n){

        if ( n == 1 ){
            return false;
        }
        
        for( int i = 2; i <= ( long )Math.sqrt( n ); i++ ){
            if( n % i == 0 ){
                return false;
            }
        }
        
        return true;

    }

}
