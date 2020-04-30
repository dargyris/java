class DoWhileLoop{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        int count = 6;
        do {
            System.out.println( "Count value was " + count );
            count++;

            if ( count > 100 ){
                break;
            }
        } while ( count != 6 );

    }

}
