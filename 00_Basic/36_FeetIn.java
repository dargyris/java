class FeetIn{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        calcFeetAndInchesToCentimeters( 6, 0 );
        calcFeetAndInchesToCentimeters( 184.253432 );

    }

    public static double calcFeetAndInchesToCentimeters(  
        double feet,
        double inches){

        if( feet < 0 || ( inches < 0 || inches > 12 ) ){
            System.out.println( "Invalid input." );
            return -1;
        }

        double centimeters = ( feet * 12 ) * 2.54;
        centimeters += inches * 2.54;
        System.out.println( feet + " feet, " + inches + " inches = " + centimeters + " cm." );
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(  
        double inches){
        
        if( inches < 0 ){
            System.out.println( "Invalid input 1." );
            return -1;
        }
        
        double feet = ( int ) inches / 12;
        inches -= ( feet * 12 );
        return calcFeetAndInchesToCentimeters( feet, inches);
        
    }

}
