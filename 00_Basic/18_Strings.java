class Strings{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.println("Primitive types:");
        System.out.println("byte     8  bits -127 ... 128");
        System.out.println("short    16 bits");
        System.out.println("int      32 bits");
        System.out.println("long     64 bits");
        System.out.println("float    32 bits");
        System.out.println("double   64 bits");
        System.out.println("char     16 bits");
        System.out.println("boolean  64 bits");
        System.out.println("\n");

        String myString = "This is a string";
        System.out.println("myString = " + myString + "\n");
        myString = myString + ", and this is more.";
        System.out.println("Now, myString = " + myString + "\n");
        myString = myString + " \u00A9 2020";
        System.out.println("Now, myString = " + myString + "\n");
        
        String numberString = "250.55";
        System.out.println("numberString: " + numberString);
        numberString = numberString + "49.95";
        System.out.println("numberString: " + numberString + "\n");

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString: " + lastString + "\n");

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString: " + lastString + "\n");
    }
}
