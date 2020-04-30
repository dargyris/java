class StringInt{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        String numberAsString = "2018";
        // Classes start with a Capital letter.
        // "parseInt" is a "static method" of the wrapper class Integer.
        short myShort = Short.parseShort( numberAsString );
        int myInt = Integer.parseInt( numberAsString );
        long myLong = Long.parseLong( numberAsString );
        float myFloat = Float.parseFloat( numberAsString );
        double myDouble = Double.parseDouble( numberAsString );
        
        System.out.println( "numberAsString: " + numberAsString + "\n" );
        System.out.println( "Short\t: " + myShort );
        System.out.println( "Int\t: " + myInt );
        System.out.println( "Long\t: " + myLong ); 
        System.out.println( "Float\t: " + myFloat );
        System.out.println( "Double\t: " + myDouble );
        System.out.println( "\n********************************" );
        numberAsString += 1;
        myShort += 1;
        myInt += 1;
        myLong += 1;
        myFloat += 1;
        myDouble += 1;

        System.out.println( "numberAsString: " + numberAsString + "\n" );
        System.out.println( "Short\t: " + myShort );
        System.out.println( "Int\t: " + myInt );
        System.out.println( "Long\t: " + myLong ); 
        System.out.println( "Float\t: " + myFloat );
        System.out.println( "Double\t: " + myDouble );

    }

}
