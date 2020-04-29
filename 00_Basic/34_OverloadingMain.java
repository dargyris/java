class OverloadingMain{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        int newScore = Overloading.calculateScore( "Tim", 500 );
        System.out.println( "New score is " + newScore );

        int newScoreUn = Overloading.calculateScore( 800 );
        System.out.println( "New unnamed score is " + newScoreUn );

        Overloading.calculateScore(  );
    }

}
