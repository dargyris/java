class FloatDouble{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.println("Hello!");
        byte myByteValue        = 5;
        short myShortValue      = 5;
        int myIntValue          = 5;
        long myLongValue        = 5L;
        float myFloatValue      = 5F;
        double myDoubleValue    = 5D;

        System.out.println("Byte value\t: " + myByteValue);
        System.out.println("Short value\t: " + myShortValue);
        System.out.println("Int value\t: " + myIntValue);
        System.out.println("Long value\t: " + myLongValue);
        System.out.println("Float value\t: " + myFloatValue);
        System.out.println("Double value\t: " + myDoubleValue + "\n");
        
        System.out.println("Demonstrating Division");
        myByteValue     = 5/3;
        myShortValue    = 5/3;
        myIntValue      = 5/3;
        myLongValue     = 5L/3;
        myFloatValue    = 5F/3;
        myDoubleValue   = 5D/3;

        System.out.println("Byte value\t: " + myByteValue);
        System.out.println("Short value\t: " + myShortValue);
        System.out.println("Int value\t: " + myIntValue);
        System.out.println("Long value\t: " + myLongValue);
        System.out.println("Float value\t: " + myFloatValue);
        System.out.println("Double value\t: " + myDoubleValue + "\n");

        }
}
