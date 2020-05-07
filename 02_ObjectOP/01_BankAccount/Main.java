class Main{

    public static void main ( String[] args ){
        
        Account firstAccount = new Account();

        boolean flag = true;
        while ( flag ) {
            int status = 0;
            // Stores return values of each function to check 
            // if everything went well.

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
                    break; 
                case 2: 
                    status = Deposit.deposit( firstAccount );
                    break; 
                case 3: 
                    status = Withdraw.withdraw( firstAccount );
                    break; 
                case 4: 
                    AccountStatus.accountStatus( firstAccount );
                    break; 
                default: 
                    Decorator.decorator();
                    System.out.println( "\t------------------------------------" );
                    System.out.println( "\tMax number of tries reached." );
                    System.out.println( "\tPlease try again later.\n" );
                    System.out.println( "\t====================================" );
                    System.out.println( "\tGoodbye!\n\n" );
                    flag = false;
                    break; 
            }
        } 
    }

}
