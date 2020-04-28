// Ternary Operator
class TernaryOp{
    public static void main(String[] args){
    System.out.print("\033[H\033[2J");
    
    // Car example
    System.out.println("Car example:");
    boolean isCar = false;
    boolean wasCar = isCar ? true : false;
    System.out.println("isCar: " + isCar);
    System.out.println("wasCar: " + wasCar + "\n");

    // Age of clients
    System.out.println("Age of clients example:");
    int ageOfClient = 20;
    boolean isEighteenOrOver = ageOfClient == 20 
        ? true : false;
    System.out.println("Client's age: " + ageOfClient);
    System.out.println("Criterion: His age must be 20.");
    System.out.println("Over eighteen: "
        + isEighteenOrOver + "\n");

    // String print
    System.out.println("Strings example:");
    String isMyName = "Diamantis";
    String myTrueString = "True String";
    String myFalseString = "False String";
    String myString = isMyName == "Diamantis" 
        ? myTrueString : myFalseString;
    System.out.println("My name is: " + isMyName);
    System.out.println("Criterion: My name must be Diamantis.");
    System.out.println("Test evaluates: " 
        + (isMyName == "Diamantis"));  
    System.out.println("myString: " + myString + "\n");

    }
}
