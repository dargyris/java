class FeetInches{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        double myReturnValue = 0.d;

        myReturnValue = calcFeetAndInchesToCentimeters( 100.125, 1.253 );
        System.out.println( "Returned: " + ( int ) myReturnValue + ".\n" );

        myReturnValue = calcFeetAndInchesToCentimeters( 100.254 );
        System.out.println( "Returned: " + ( int ) myReturnValue + ".\n" );

    }

    public static double calcFeetAndInchesToCentimeters(  
    double feet,
    double inches){

        if( feet >= 0.d && ( inches >= 0.d && inches <= 12.d ) ){
            double centInches = inches * 2.54;
            double centFeet = feet * 12 * 2.54;
            System.out.println( "Centimeters: " + ( centInches + centFeet ) + "." );
            return 0;
        }

        System.out.println( "Invalid input.\n" );
        return -1.d;

    }

    public static double calcFeetAndInchesToCentimeters(  
    double inches){

        if( inches >= 0.d ){
            double feet = ( double )( ( int )( inches / 12 ) );
            System.out.println( "Feet: " + feet );
            double remInches = ( double )( inches % 12.d );
            System.out.println( "Inches: " + remInches );
            calcFeetAndInchesToCentimeters( feet, remInches );
            return 0.d;
        }

        System.out.println( "Invalid input.\n" );
        return -1.d;

    }
        
    
}
