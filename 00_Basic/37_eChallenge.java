class eChallenge{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        System.out.println( getDurationString( 61, 0 ) );
        System.out.println( getDurationString( 3945 ) );

    }

    public static String getDurationString(  
        int minutes,
        int seconds){

        if( minutes < 0 || seconds < 0 || seconds > 60 ){
            return "Invalid input. ( 1 )";
        }

        int hours = ( int )minutes / 60;
        minutes -= hours * 60;
        if( hours < 10 && minutes < 10 && seconds < 10 ){
            return "0" + hours + "h 0" + minutes + "m 0" + seconds + "s";
        } else if ( hours < 10 && minutes < 10 ){
            return "0" + hours + "h 0" + minutes + "m " + seconds + "s";
        } else if( hours < 10 ){
            return "0" + hours + "h " + minutes + "m " + seconds + "s";
        } else {
            return hours + "h " + minutes + "m " + seconds + "s";
        }

    }

    public static String getDurationString(  
        int seconds){

        if( seconds < 0 ){
            return "Invalid input. ( 2 )";
        }

        int minutes = ( int ) seconds / 60;
        seconds -= minutes * 60;
        return getDurationString( minutes, seconds );

    }

}
