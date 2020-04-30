class bChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        printDayOfTheWeek( 1 );
        printDayOfTheWeek( 0 );
        printDayOfTheWeek( "Tuesday" );
        printDayOfTheWeek( "tuesday" );

    }

    public static void printDayOfTheWeek(  
        int day){

        switch( day ){
            case 0:
                System.out.println( "Sun" );
                break;
            case 1:
                System.out.println( "Mon" );
                break;
            case 2:
                System.out.println( "Tue" );
                break;
            case 3:
                System.out.println( "Wed" );
                break;
            case 4:
                System.out.println( "Thu" );
                break;
            case 5:
                System.out.println( "Fri" );
                break;
            case 6:
                System.out.println( "Sat" );
                break;
            default:
                System.out.println( "Not a valid day" );
                break;
        }


    }
    
    public static void printDayOfTheWeek(  
        String day){

        if( day == "Sunday" ){
            System.out.println( "Sun" );
        } else if ( day == "Monday" ){
            System.out.println( "Mon" );
        } else if ( day == "Tuesday" ){
            System.out.println( "Tue" );
        } else if ( day == "Wednesday" ){
            System.out.println( "Wed" );
        } else if ( day == "Thursday" ){
            System.out.println( "Thu" );
        } else if ( day == "Friday" ){
            System.out.println( "Fri" );
        } else if ( day == "Saturday" ){
            System.out.println( "Sat" );
        } else {
            System.out.println( "Not a valid day." );
        }
    
    }

}
