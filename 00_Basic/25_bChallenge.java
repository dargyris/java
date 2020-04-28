class bChallenge{
    public static void main(String[] args){
    System.out.print("\033[H\033[2J");

    double doubleA = 20.d;
    double doubleB = 80.d;
    double result = (doubleA + doubleB) * 100.d;
    double remainder = result % 40.d;

    System.out.println("Var A\t: " + doubleA);
    System.out.println("Var B\t: " + doubleB);
    System.out.println("result\t: " + result);
    System.out.println("Remainder: " + remainder);
    
    boolean isRemainderZero = (remainder == 0) ?
        true : false;
    System.out.println("remainder = 0: " + isRemainderZero + "\n");

    if ( !isRemainderZero ){
        System.out.println("Got some remainder.\n");
        }

    }
}
