class Overloading{

        public static int calculateScore(  
        String playerName,
        int score){

        System.out.println( "Player " + playerName + " scored " + score + " points." );
        return score * 1000;

    }


    public static int calculateScore(  
        int score){

        System.out.println( "Unnamed player scored " + score + " points." );
        return score * 1000;

    }
    
    public static void calculateScore(   ){

        System.out.println( "I am in the empty method now!\n" );

    }
}
