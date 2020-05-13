public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        System.out.println( "\n" );

        AbstractProperties theAbstractProperties = new AbstractProperties();
        Dimensions theDimensions = new Dimensions();
        PhysicalProperties thePhysicalProperties = new PhysicalProperties();
        Chair theChair = new Chair();
        Desk theDesk = new Desk();
        Door theDoor = new Door();
        Window theWindow = new Window();
        Tiles theTiles = new Tiles();
        Floor theFloor = new Floor();
        Room theRoom = new Room();
        PhysicalSpace thePhysicalSpace = new PhysicalSpace();

        // PRINTING =========================================================
        theDimensions.printContent();
        System.out.println();
        thePhysicalProperties.printContent();
        System.out.println();
        theAbstractProperties.printContent();
        System.out.println();
        theChair.printContent();
        System.out.println();
        theDesk.printContent();
        System.out.println();
        theDoor.printContent();
        System.out.println();
        theWindow.printContent();
        System.out.println();
        theTiles.printContent();
        System.out.println();
        theFloor.printContent();
        System.out.println();
        theRoom.printContent();
        System.out.println();
        thePhysicalSpace.printContent();
        System.out.println();

    }

}
