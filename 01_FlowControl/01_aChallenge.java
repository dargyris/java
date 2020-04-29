class aChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        char myChar = 'c';

        switch( myChar ){
            case 'A':
                System.out.println( "It was an A." );
                break;
            case 'B':
                System.out.println( "It was a B." );
                break;
            case 'C':
                System.out.println( "It was a C." );
                break;
            case 'D':
                System.out.println( "It was a D." );
                break;
            case 'E':
                System.out.println( "It was an E." );
                break;
            case 'F':
                System.out.println( "It was an F." );
                break;
            case 'a': case 'b': case 'c': case 'd': case 'e': case 'f':
                System.out.println( "It was one of the 6 first lower case letters" + 
                    " of the English alphabet.");
                System.out.println( "It was actually a " + myChar + "\n");
                break;
            default:
                System.out.println( "It was none of the first 6 capital letters" + 
                    " of the English alphabet.\n");
                break;
            } 
    }

}
