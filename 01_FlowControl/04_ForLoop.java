class ForLoop{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        for( double i = 0.5; i < 9; i+=0.5 ){
            System.out.println( "10.000 at " + i + "% interest: " + 
                String.format( "%.2f", calculateInterest( 10000.0, i ) )  );
        }

        System.out.println( "---------------------------------------------------" );
        System.out.println( "10.000 at 9.0% interest: " + 
            String.format( "%.2f", calculateInterest( 10000.0, 9.d ) )  );
        System.out.println( "---------------------------------------------------" );
        
        for( double i = 8.5; i >= 0.5 ; i-=0.5 ){
            System.out.println( "10.000 at " + i + "% interest: " + 
                String.format( "%.2f", calculateInterest( 10000.0, i ) )  );
        }

    }

    public static double calculateInterest(  
        double amount,
        double interestRate){

        return ( amount * ( interestRate / 100 ) );

    }

}
