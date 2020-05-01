class Main{

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        int choice = Menu.menu();
        switch ( choice ){          
            case 0:                    
                System.out.print("\033[H\033[2J"); 
                Decorator.decorator();
                System.out.println( "Thank you for using our services!" );
                System.out.println( "Have a nice day!\n" );
                break; 
            case 1: 
                System.out.print("\033[H\033[2J"); 
                Decorator.decorator();
                System.out.println( "New Account:\n" ); 
                break; 
            case 2: 
                System.out.print("\033[H\033[2J"); 
                Decorator.decorator();
                System.out.println( "Deposit Funds:\n" ); 
                break; 
            case 3: 
                System.out.print("\033[H\033[2J"); 
                Decorator.decorator();
                System.out.println( "Withdraw Funds:\n" ); 
                break; 
            case 4: 
                System.out.print("\033[H\033[2J"); 
                Decorator.decorator();
                System.out.println( "Printing Status:\n" ); 
                break; 
            default: 
                System.out.print("\033[H\033[2J"); 
                Decorator.decorator();
                System.out.println( "Max number of tries reached." );
                System.out.println( "Please try again later.\n" );
                break; 
        } 
    }

}
