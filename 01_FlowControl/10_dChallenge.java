class dChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        int startNumber = 4;
        int endNumber = 20;

        int number = startNumber;
        int counter = 0;

        while( number <= endNumber && counter < 5){
            if( !isEvenNumber( number ) ){
                number++;
                continue;
            }
            System.out.println( number + " is even." );
            number++;
            counter++;
        }

        System.out.println( "Total: " + counter );

    }

    public static boolean isEvenNumber(  
    int number){

        if( number % 2 == 0 ){
            return true;
        }
    
        return false;

    }

}
