class DoubleControl{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        int myIntA = 5;
        int myIntB = 3;

        if ( myIntA < 10 && myIntB < 10 ){
            System.out.println( "Both" );
        }
        if ( myIntA < 10 ){
            System.out.println( "A" );
        }

    }

}
