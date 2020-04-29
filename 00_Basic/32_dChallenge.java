class dChallenge{

    public static void main( String[] args ){

        System.out.print("\033[H\033[2J");

        double myNumber = 0.d;
        checkNumber( myNumber );

    }

    public static void checkNumber(  double myNumber ){

        if( myNumber > 0 ){
            System.out.println( "The number is positive.\n" );
        } else if( myNumber < 0 ){
            System.out.println( "The number is negative.\n" );
        } else{
            System.out.println( "The number is equal to 0.\n" );
        }

    }

}
