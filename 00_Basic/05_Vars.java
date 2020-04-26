class Vars{

    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.println("Cluck!\n");
        System.out.println("      /'._     _,     ");  
        System.out.println("      \\   ;__.'  }   ");
        System.out.println("   (`-._;-\" _.--.}'  ");
        System.out.println("   /_'    /`    _}    ");
        System.out.println("     `.  \\_._.;      ");
        System.out.println("       '-.__ /        ");
        System.out.println("        _/  `\\       ");
        System.out.println("        ^`   ^`       ");        
        System.out.println("\n");
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

// Exercise: Create variable "myLastOne" so that it is myTotal - 1000
        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);
        }
}
