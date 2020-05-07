public class Main {

    public static void main ( String[] args ){
        System.out.print("\033[H\033[2J");

        Account bobsAccount = new Account("1234", 0., "Bob Brown", 
                "email@email.com", "(090) 242-4009");

        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.);
        bobsAccount.withdrawal(100.);
        bobsAccount.deposit(51.);
        bobsAccount.withdrawal(100.);
        
        System.out.println( "Name\t:" + bobsAccount.getCustomerName());
        System.out.println( "Number\t:" + bobsAccount.getNumber() );
        System.out.println( "Balance\t:" + bobsAccount.getCustomerEmail());
        System.out.println( "Phone\t:" + bobsAccount.getCustomerPhone );
    }

}
