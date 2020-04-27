class IfElse{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        
        String Explanation = "Conditional logic: " + 
            "It uses specific statements in Java to allow us" + 
            "to check a condition and execute certain code" + 
            "based on whether that condition (the expression)" + 
            "is true of false\n";
        
        System.out.println(Explanation);

        boolean isAlien = false;
        if (isAlien == false){   // This is a -- true -- statement
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens...\n");
            }
        else
            System.out.println("It is definitely from outer space.");

        int topScore = 001;
        if (topScore == 100){
            System.out.println("You got the high score!\n");
            }
        else if (topScore > 100){
            System.out.println("Cheated too much!\n");
            }
        else if (topScore <= 99 && topScore >= 50){
            System.out.println("Let's say you did good.\n");
            }
        else if (topScore >= 0){
            System.out.println("This is preposterous!\n");
            }
        else {
            System.out.println("Now, you're just being dramatic.\n");
            }

            
    }
}

