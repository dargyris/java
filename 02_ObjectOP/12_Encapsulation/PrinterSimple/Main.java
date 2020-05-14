public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Printer thePrinter = new Printer(50, false);
        System.out.println( "Initial page count: " + thePrinter.getItsPagesPrinted() );
        int pagesPrinted = thePrinter.printPages(4);
        System.out.println( "Pages printed was " + pagesPrinted );
        System.out.println( "New total print count for printer: " + thePrinter.getItsPagesPrinted());

        pagesPrinted = thePrinter.printPages(2);
        System.out.println( "Pages printed was " + pagesPrinted );
        System.out.println( "New total print count for printer: " + thePrinter.getItsPagesPrinted());


    }

}
