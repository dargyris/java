class SwitchMonths{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        String myMonth = "January";

        switch( myMonth ){
            case "January":
                System.out.println( "Jan" );
                break;
            case "February":
                System.out.println( "Feb" );
                break;
            case "March":
                System.out.println( "Mar" );
                break;
            case "April":
                System.out.println( "Apr" );
                break;
            case "May":
                System.out.println( "May" );
                break;
            case "June":
                System.out.println( "Jun" );
                break;
            case "July":
                System.out.println( "Jul" );
                break;
            case "August":
                System.out.println( "Aug" );
                break;
            case "September":
                System.out.println( "Sep" );
                break;
            case "October":
                System.out.println( "Oct" );
                break;
            case "November":
                System.out.println( "Nov" );
                break;
            case "December":
                System.out.println( "Dec" );
                break;
            default:
                System.out.println( "Not a valid month." );
                break;

        }

    }

}
