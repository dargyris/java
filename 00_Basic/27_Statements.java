class Statements{
    public static void main(String[] args){
        System.out.print( "\033[H\033[2J" );
    
        int myVariable = 50; // Statement: Entire line
        myVariable++;
        myVariable--;
        System.out.println( "This is a test." );
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if( score < 5000 && score > 1000 ){ 
            System.out.println( "Your score was less than 5000" + 
                "but greater than 1000.");
        } else if( score < 1000 ){
              System.out.println( "Your score was less than 1000" );
        } else {
            System.out.println( "Got here." ); 
        }
        
        if( gameOver ){ // gameOver == true
            int finalScore = score + ( levelCompleted * bonus );
            System.out.println( "Your final score was " + finalScore );
        }
        
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if( gameOver ){ // gameOver == true
            int finalScore = score + ( levelCompleted * bonus );
            System.out.println( "Your final score was " + finalScore );
        }

    }
}
