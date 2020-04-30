class fChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        int myNumber = 10;
        System.out.println( "Sum: " + sumDigits( myNumber ) ) ;
        myNumber = 11;
        System.out.println( "Sum: " + sumDigits( myNumber ) ) ;
        myNumber = 99;
        System.out.println( "Sum: " + sumDigits( myNumber ) ) ;
        myNumber = 555;
        System.out.println( "Sum: " + sumDigits( myNumber ) ) ;
        myNumber = 11111;
        System.out.println( "Sum: " + sumDigits( myNumber ) ) ;
    }
    
    public static int sumDigits(  
    int number){

        if( number < 10 ){
            return -1;
        }

        int sum = 0;
        while( number > 0 ){
            // Extracting the least significant digit
            sum += number % 10;
            // Dropping the least significant digit
            number /= 10;
        }

        return sum;

    }

}
