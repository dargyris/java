class FloatCasting {

    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        byte myByteValue = 120;
        short myShortValue = 150;
        int myIntValue = 1151515150;
        long myLongValue = 1502501500L;
        float myFloatValue = 5.25F;
        double myDoubleValue = 5.25D;
        
        System.out.println("myByteValue\t: " + myByteValue);
        System.out.println("myShortValue\t: " + myShortValue);
        System.out.println("myIntValue\t: " + myIntValue);
        System.out.println("myLongValue\t: " + myLongValue + "\n");

        System.out.println("Casting Integers: All -> Byte");
        myByteValue = (byte)(myShortValue);
        System.out.println("Short\t-> Byte\t: " + myByteValue);
        myByteValue = (byte)(myIntValue);
        System.out.println("Int\t-> Byte\t: " + myByteValue);
        myByteValue = (byte)(myLongValue);
        System.out.println("Long\t-> Byte\t: " + myByteValue + "\n");
        
        System.out.println("Casting Floats: All -> Float");
        System.out.println("Byte\t-> Float\t: " + (float)(myByteValue));
        System.out.println("Short\t-> Float\t: " + (float)(myShortValue));
        System.out.println("Int\t-> Float\t: " + (float)(myIntValue));
        System.out.println("Long\t-> Float\t: " + (float)(myLongValue) + "\n");

        System.out.println("I can also cast numbers.");
        System.out.println("(float)2\t: " + (float)2);
        System.out.println("(float)10\t: " + (float)10);
        System.out.println("(float)3.14\t: " + (float)3.14 + "\n");
        }
        

}
