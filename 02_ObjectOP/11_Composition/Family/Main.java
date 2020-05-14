public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        System.out.println( "\n" );
        Organism theOrganism = new Organism();
        Human theHuman = new Human();
        Grandparent theGrandparent = new Grandparent();
        Parent theParent = new Parent();
        Child theChild = new Child();

        // PRINTS ==============================

        theOrganism.printDetails();
        System.out.println();
        theHuman.printDetails();
        System.out.println();
        theGrandparent.printDetails();
        System.out.println();
        theParent.printDetails();
        System.out.println();
        theChild.printDetails();
        System.out.println();

    }

}
