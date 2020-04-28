class Expressions{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        if(highScore == 50){
            System.out.println("This is an expression.");
            }

        int score = 100; // Expr: "score = 100"
        if (score > 99){ // Expr: "score > 99"
            System.out.println("You got the high score!");
            // Expr: "You got the high score!"
            score = 0; // Expr: "score = 0"
            }

    }
}
