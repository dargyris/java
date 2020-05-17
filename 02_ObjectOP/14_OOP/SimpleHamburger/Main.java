public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Hamburger theHamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = theHamburger.itemizeHamburger();
        theHamburger.addHamburgerAdditionA("Tomato", 0.27);
        theHamburger.addHamburgerAdditionB("Lettuce", 0.27);
        theHamburger.addHamburgerAdditionC("Cheese", 1.12);
        System.out.println( "Total price: " + theHamburger.itemizeHamburger() );

        HealthyBurger theHealthyBurger = new HealthyBurger("Bacon", 5.67d);
        theHealthyBurger.addHamburgerAdditionA("Egg", 5.43);
        theHealthyBurger.addHealthAdditionA("Lentils", 3.41);
        System.out.println( "Total: " + theHealthyBurger.itemizeHamburger() );

        Deluxe theDeluxe = new Deluxe();
        theDeluxe.addHamburgerAdditionC("Should not be able to do this", 50.53);
        theDeluxe.itemizeHamburger();

    }

}
