public class Deluxe extends Hamburger {

    public Deluxe(){
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAdditionA("Chips", 2.75);
        super.addHamburgerAdditionB("Drink", 1.81);
    }

    @Override
    public void addHamburgerAdditionA(String name, double price){
        System.out.println( "Cannot add additional items to a deluxe!" );
    }

    @Override
    public void addHamburgerAdditionB(String name, double price){
        System.out.println( "Cannot add additional items to a deluxe!" );
    }

    @Override
    public void addHamburgerAdditionC(String name, double price){
        System.out.println( "Cannot add additional items to a deluxe!" );
    }

    @Override
    public void addHamburgerAdditionD(String name, double price){
        System.out.println( "Cannot add additional items to a deluxe!" );
    }

}
