class Operators{
    public static void main(String[] args){
    System.out.print("\033[H\033[2J");

    int aScore = 100;
    int bScore = 80;
    int cScore = 50;
    int dScore = 20;
    int eScore = 0;

    int myScore = 89;

    if ((myScore < aScore) && (myScore > bScore)){
        System.out.println("You are a top scorer!\n");
        }
    else if ((myScore < bScore) && (myScore > cScore)){
        System.out.println("You are a b- scorer.\n");
        }
    else if ((myScore < cScore) && (myScore > dScore)){
        System.out.println("You are a c- scorer.\n");
        }
    else if ((myScore < dScore) && (myScore > 0)){
        System.out.println("This is preposterous!\n");
        }
    else if (myScore < 0){
        System.out.println("Ah! Don't be a drama queen!\n");
        }
    else{
        System.out.println("That's too much cheating!\n");
        }

    }
}
