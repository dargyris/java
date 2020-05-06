public class Main {

    public static void main ( String[] args ){
        System.out.print("\033[H\033[2J");

        Account bobsAccount = new Account();
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.);
        bobsAccount.withdrawal(100.);
        bobsAccount.deposit(51.);
        bobsAccount.withdrawal(100.);

    }

}
