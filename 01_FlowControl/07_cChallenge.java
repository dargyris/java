class cChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        System.out.println( "Sum: " + sumModThreeModFive( 1, 1000 ) );

    }
    
    public static long sumModThreeModFive(  
    int start,
    int end){

        int sum = 0;
    
        for( int i = 1, j = 1; i <= 1000 && j <= 5; i++ ){
            if( i % 3 == 0 && i % 5 == 0 ){
                System.out.println( j + ". " + i );
                sum += i;
                j++;
            }
        }
        
        return sum;

    }
}
