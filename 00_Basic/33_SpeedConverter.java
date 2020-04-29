class SpeedConverter{ 
    
    public static long toMilesPerHour(  double kilometersPerHour ){

        if( kilometersPerHour < 0 ){
            return -1l;
        }

        return ( long )( Math.round( kilometersPerHour / 1.60934 ) );

    } // End of toMilesPerHour

    public static void printConversion( double kilometersPerHour ){

        long milesPerHour = toMilesPerHour( kilometersPerHour );
        if ( milesPerHour == -1 ){
            System.out.println( "Invalid input.\n" );
        } else {
            System.out.println( kilometersPerHour 
                + " km/h = " + milesPerHour + " mi/h.\n" );
        }

    } // End of printConversion

}
