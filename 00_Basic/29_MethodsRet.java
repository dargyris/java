class MethodsRet{

    public static void main( String[] args ){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = 0;
        finalScore = calculateScore( gameOver, score, levelCompleted, bonus );
        System.out.println( "Your final score was " + finalScore );

    } // End of main
    
    public static int calculateScore(
        boolean gameOver,
        int score,
        int levelCompleted,
        int bonus){

        if( gameOver ){

            int finalScore = score + ( levelCompleted * bonus );
            finalScore += 1000;
            return finalScore;

        } else {

            return -1; 

        }
        

    } // End of calculateScore

}
