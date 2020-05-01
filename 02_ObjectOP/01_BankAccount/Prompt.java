class Prompt{

    public static void prompt( int threeTries ){

        switch ( threeTries ) {
            case 0:
                System.out.print( "> " );
                break;
            case 1:
                System.out.println( "Unknown choice." );
                System.out.println( "Please try again..." );
                System.out.println( "( Rem. tries: 2 )" );
                System.out.print( "> " );
                break;
            case 2:
                System.out.println( "Unknown choice." );
                System.out.println( "Please try again..." );
                System.out.println( "( Rem. tries: 1 )" );
                System.out.print( "> " );
                break;
            case 3:
                System.out.println( "Reached max number of tries." );
                System.out.println( "Quitting...\n" );
                break;
        }

    }

}
