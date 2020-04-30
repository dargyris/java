class eChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        int number = 44;
        System.out.println( "Sum: " + sumDigits ( number ) );
        number = -44;
        System.out.println( "Sum: " + sumDigits ( number ) );
        number = 4;
        System.out.println( "Sum: " + sumDigits ( number ) );
        number = 11;
        System.out.println( "Sum: " + sumDigits ( number ) );
        number = 99;
        System.out.println( "Sum: " + sumDigits ( number ) );

    }

    public static int sumDigits(  
    int number){

        if( number >= 10 && number <= 99 ){
            return ( number / 10 ) + ( number % 10 ) ;
        }

        return -1;

    }

}
