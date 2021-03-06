class Constants{ 

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        System.out.println( getDurationString( 61, 0 ) );
        System.out.println( getDurationString( 3945 ) );
        System.out.println( getDurationString( -41 ) );

    }

    public static String getDurationString(  
        int minutes,
        int seconds){

        if( minutes < 0 || seconds < 0 || seconds > 60 ){
            return INVALID_VALUE_MESSAGE;
        }

        int hours = ( int )minutes / 60;
        minutes -= hours * 60;

        String strHours = hours + "h ";
        if( hours < 10 ){
            strHours = "0" + strHours;
        }
        String strMinutes = minutes + "m ";
        if( minutes < 10 ){
            strMinutes = "0" + strMinutes;
        }
        String strSeconds = seconds + "s";
        if ( seconds < 10 ){
            strSeconds = "0" + strSeconds;
        }
        
        return strHours + strMinutes + strSeconds;

    }

    public static String getDurationString(  
        int seconds){

        if( seconds < 0 ){
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = ( int ) seconds / 60;
        seconds -= minutes * 60;
        return getDurationString( minutes, seconds );

    }

}
