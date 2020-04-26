class aChallenge{
    public static void main(String[] args){

        //==================================================================
        // Java Dragon
        System.out.print("\033[H\033[2J");
        System.out.println("Grrrrr!");
        System.out.println(" _______________________________________ ");
        System.out.println("|<>=======()                            |");
        System.out.println("|(/\\___   /|\\\\          ()==========<>_ |");
        System.out.println("|      \\_/ | \\\\        //|\\   ______/ \\)|");
        System.out.println("|        \\_|  \\\\      // | \\_/          |"); 
        System.out.println("|          \\|\\/|\\_   //  /\\/            |"); 
        System.out.println("|           (oo)\\ \\_//  /               |");
        System.out.println("|          //_/\\_\\/ /  |                |");
        System.out.println("|         @@/  |=\\  \\  |                |");
        System.out.println("|              \\_=\\_ \\ |                |");
        System.out.println("|                \\==\\ \\|\\_              |");
        System.out.println("|             __(\\===\\(  )\\             |");
        System.out.println("|            (((~) __(_/   |            |");
        System.out.println("|                 (((~) \\  /            |");
        System.out.println("|                 ______/ /             |");
        System.out.println("|                 '------'              |");
        System.out.println("|_______________________________________|");
        System.out.println("\n");
        //==================================================================

        byte myByteVar1 = 0;
        byte myByteVar2 = 0;
        short myShortVar1 = 0;
        short myShortVar2 = 0;
        int myIntVar1 = 0;
        int myIntVar2 = 0;
        long myLongVar1 = 0L;
        long myLongVar2 = 0L;

        System.out.println("Now printing my variable collection:");
        System.out.println("myByteVar1\t: " + myByteVar1 + "\tSize: 8 Bits.");
        System.out.println("myByteVar2\t: " + myByteVar2 + "\tSize: 8 Bits.");
        System.out.println("Min Byte Value\t: " + Byte.MIN_VALUE);
        System.out.println("Max Byte Value\t: " + Byte.MIN_VALUE + "\n");
        
        System.out.println("myShortVar1\t: " + myShortVar1 + "\tSize: 16 Bits.");
        System.out.println("myShortVar2\t: " + myShortVar2 + "\tSize: 16 Bits.");
        System.out.println("Min Short Value\t: " + Short.MIN_VALUE);
        System.out.println("Max Short Value\t: " + Short.MAX_VALUE + "\n");
        
        System.out.println("myIntVar1\t: " + myIntVar1 + "\tSize: 32 Bits.");
        System.out.println("myIntVar2\t: " + myIntVar2 + "\tSize: 32 Bits.");
        System.out.println("Min Int Value\t: " + Integer.MIN_VALUE);
        System.out.println("Max Int Value\t: " + Integer.MAX_VALUE + "\n");
        
        System.out.println("myLongVar1\t: " + myLongVar1 + "\tSize: 64 Bits.");
        System.out.println("myLongVar2\t: " + myLongVar2 + "\tSize: 64 Bits.");
        System.out.println("Min Long Value\t: " + Long.MIN_VALUE);
        System.out.println("Max Long Value\t: " + Long.MAX_VALUE + "\n");
        
        System.out.println("=========================================");
        
        System.out.println("Some Calculations:");
        myByteVar1 = 15;
        myByteVar2 = (byte)(myByteVar1 * 1.5);
        System.out.println("myByteVar1\t: " + myByteVar1);
        System.out.println("myByteVar2\t: " + myByteVar2 + "\n");

        myShortVar1 = 25;
        myShortVar2 = (short)(myShortVar1 / 1.5);
        System.out.println("myShortVar1\t: " + myShortVar1);
        System.out.println("myShortVar2\t: " + myShortVar2 + "\n");

        myIntVar1 = 155;
        myIntVar2 = (int)(myIntVar1 * 15 + (120/myIntVar1) );
        System.out.println("myIntVar1\t: " + myIntVar1);
        System.out.println("myIntVar2\t: " + myIntVar2 + "\n");

        myLongVar1 = 1500;
        myLongVar2 = (long)(myLongVar1 / (myByteVar1 + myShortVar1 + myIntVar1));
        System.out.println("myLongVar1\t: " + myLongVar1);
        System.out.println("myLongVar2\t: " + myLongVar2 + "\n");
    }
}
