class SpeedMain{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        long miles = SpeedConverter.toMilesPerHour( 10.5 );
        System.out.println( "Miles = " + miles );

        SpeedConverter.printConversion( 10.5 );

    }

}
