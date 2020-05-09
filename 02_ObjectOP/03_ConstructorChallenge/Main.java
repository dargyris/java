public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        VipCustomer customerA = new VipCustomer();
        VipCustomer customerB = new VipCustomer("Kostas", 25000., "kostas@mail.com");
        VipCustomer customerC = new VipCustomer("Giannis", 2000.);

        System.out.println( "customerA: " + customerA.getItsName() 
                + " " + customerA.getItsCreditLimit() + " " + customerA.getItsEmail() );

        System.out.println( "customerB: " + customerB.getItsName() 
                + " " + customerB.getItsCreditLimit() + " " + customerB.getItsEmail() );

        System.out.println( "customerC: " + customerC.getItsName() 
                + " " + customerC.getItsCreditLimit() + " " + customerC.getItsEmail() );
    }

}
