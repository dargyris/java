public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Dimensions theDimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", theDimensions);

        Monitor theMonitor = new Monitor("27inch Beash", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }

}
