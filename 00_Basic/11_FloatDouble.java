class FloatDouble{
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
        
        System.out.println("Float\t: Single Precision Number.");
        System.out.println("Single precision: 32 Bits.");
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue + "\n");

        System.out.println("Double\t: Double Precision Number.");
        System.out.println("Double precision: 64 Bits.");
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue + "\n");

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
        System.out.println("myIntValue\t:" + myIntValue);
        System.out.println("myFloatValue\t:" + myFloatValue);
        System.out.println("myDoubleValue\t:" + myDoubleValue);
        }
}
