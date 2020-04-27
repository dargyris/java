class Bools{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        
        System.out.println("Booleans in java can have a value of " + 
            "true/false. The key word for the declaration is \"boolean\". " + 
            "A good name for a boolean variable starts with \"is\", followed " + 
            "by a question. A full demonstration of booleans will follow " + 
            "when I work on conditional logic.\n");

        System.out.println("Spoiler: I will now use strings to print " + 
            "the same message:\n");

        String myString = "Booleans in java can have a value of " + 
            "true/false. The key word for the declaration is \"boolean\". " + 
            "A good name for a boolean variable starts with \"is\", followed " + 
            "by a question. A full demonstration of booleans will follow " + 
            "when I work on conditional logic.\n";

        System.out.println(myString);

    }
}
