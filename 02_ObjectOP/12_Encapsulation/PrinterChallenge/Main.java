public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Printer thePrinter = new Printer(40, 100, 20, true);

        thePrinter.fillToner(200);
        thePrinter.printPage(100);

    }

}
