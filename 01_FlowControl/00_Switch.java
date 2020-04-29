class Switch{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        int value = 1;
        if( value == 1 ){
            System.out.println( "Value was 1." );
        } else if( value == 2 ){
            System.out.println( "Value was 2." );
        }else {
            System.out.println( "Was neither 1 nor 2." );
        }
        
        int switchValue = 1;
        switch( switchValue ){
            case 1:
                System.out.println( "Value was 1" );
                break;

            case 2:
                System.out.println( "Value was 2" );
                break;

            case 3: case 4: case 5:
                System.out.println( "Was a 3, a 4 or a 5." );
                System.out.println( "Actually it was a " + switchValue );
                break;

            default:
                System.out.println( "Was definitely not 1, 2, 3, 4 or 5." );
                break;

        }

    }

}
