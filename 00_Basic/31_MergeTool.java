class MergeTool{

    public static void main( String[] args ) {

        String playerNameA = "Mitsos";
        String playerNameB = "Takis";
        String playerNameC = "Dina";
        String playerNameD = "Panagiotis";
        int playerScoreA = 1500;
        int playerScoreB = 900;
        int playerScoreC = 400;
        int playerScoreD = 50;
                
        displayHigherPosition( playerNameA, calculateHighScorePosition( playerScoreA ) );
        displayHigherPosition( playerNameB, calculateHighScorePosition( playerScoreB ) );
        displayHigherPosition( playerNameC, calculateHighScorePosition( playerScoreC ) );
        displayHigherPosition( playerNameD, calculateHighScorePosition( playerScoreD ) );

    } // End of main

    public static void displayHigherPosition( 
        String playerName,
        int positionInHighScore){
        
        System.out.println( playerName + " managed to get into position " + 
            positionInHighScore + " on the high scoree table.\n");
    } // End of displayHigherPosition

    public static int calculateHighScorePosition(  
        int playerScore ){
        
        int position = 4;

        if( playerScore >= 1000 ) { 
            position = 1;
        } else if ( playerScore >= 500 ) {
            position = 2;
        } else if ( playerScore >= 100 ); { 
            position = 3;
        }  
        
        return position;

    } // End of calculateHighScorePosition


}
