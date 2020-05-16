class Prompt{

    public static int prompt( int threeTries ){

        int intChoice = -1;
        switch ( threeTries ) {
            case 3:
                System.out.print( "\t> " );
                intChoice = GetInput.getInput();
                break;
            case 2: case 1:
                System.out.println( "\tUnknown choice. Please try again." );
                System.out.println( "\t( Rem. tries: " + threeTries + "/3 )\t" );
                System.out.print( "\t> " );
                intChoice = GetInput.getInput();
                break;
            case 0:
                System.out.println( "\tReached max number of tries." );
                System.out.println( "\tQuitting...\n" );
                break;
        }

        return intChoice;

    }

}
