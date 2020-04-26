class DataTypes {

    public static void main(String[] args){
        
        //==========================================
        // Java Chicken
        System.out.print("\033[H\033[2J");
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
        
        System.out.println("8 Primitive Data Types:\n");
        System.out.println("1. boolean");
        System.out.println("2. byte");
        System.out.println("3. char");
        System.out.println("4. short");
        System.out.println("5. int");
        System.out.println("6. long");
        System.out.println("7. float");
        System.out.println("8. double");
        System.out.println("\n");

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted MAX value = " +  (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1) + "\n");

        System.out.println("Chopping up numbers to make them more readable:");
        System.out.println("It will not print with underscores. But this notation");
        System.out.println("can be used in the code and makes it easier to read.\n");
        myMaxIntValue = 2_147_483_647;
        }
}
        
