class Decide {

    public static void decide(){
        System.out.println( "\n" );
        System.out.println( "Should a method be static?" );
        System.out.println( "\t|" );
        System.out.println( "\tV" );
        System.out.println( "Does it use any fields (instance variables) " 
                + "or instance methods?" );
        System.out.println( "\t|" );
        System.out.println( "     --------" );
        System.out.println( "     |      |" );
        System.out.println( "     V      V" );
        System.out.println( "    YES     NO" );
        System.out.println( "     |      |" );
        System.out.println( "     |       ->\t Probably static." );
        System.out.println( "     ->\t Probably instance." );
    }

}
