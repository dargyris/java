class Main{

    public static void main ( String[] args ){
        
        Account firstAccount = new Account();

        boolean flag = true;
        while ( flag ) {
            int choice = Menu.menu();
            switch ( choice ){          
                case 0:                    
                    Decorator.decorator();
                    System.out.println( "\n\tThank you for using our services!" );
                    System.out.println( "\tHave a nice day!\n" );
                    flag = false;
                    break;
                case 1: 
                    firstAccount = AccountCreator.accountCreator( firstAccount );
                    InitMsg.initMsg( firstAccount );
                    Interact.interact();
                    break; 
                case 2: 
                    Deposit.deposit( firstAccount );
                    break; 
                case 3: 
                    Withdraw.withdraw( firstAccount );
                    break; 
                case 4: 
                    AccountStatus.accountStatus( firstAccount );
                    Interact.interact();
                    break; 
                default: 
                    Decorator.decorator();
                    System.out.println( "Max number of tries reached." );
                    System.out.println( "Please try again later.\n" );
                    flag = false;
                    break; 
            }
        } 
    }

}
