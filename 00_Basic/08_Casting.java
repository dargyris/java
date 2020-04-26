class Casting{
    public static void main(String[] args){

        //==========================================
        // Java Chicken
        System.out.print("\033[H\033[2J");
        System.out.println("Cluck!");
        System.out.println(" ____________________ ");
        System.out.println("|                    |");
        System.out.println("|     /'._     _,    |");  
        System.out.println("|     \\   ;__.'  }   |");
        System.out.println("|  (`-._;-\" _.--.}'  |");
        System.out.println("|  /_'    /`    _}   |");
        System.out.println("|    `.  \\_._.;      |");
        System.out.println("|      '-.__ /       |");
        System.out.println("|       _/  `\\       |");
        System.out.println("|       ^`   ^`      |");
        System.out.println("|____________________|");
        System.out.println("\n");
        //==========================================
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Therefore, 8 bits.\n");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Therefore, 16 bits.\n");

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Int Minimum Value = " + myMinIntValue);
        System.out.println("Int Maximum Value = " + myMaxIntValue);
        System.out.println("Therefore, 32 bits.\n");
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("I guess we see where this is going...\n");

        System.out.println("Assigning a value to a long. Requires L at the end!");
        long myLongValue = 100L;
        System.out.println("myLongValue: " + myLongValue + "\n");

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);
        }
}
