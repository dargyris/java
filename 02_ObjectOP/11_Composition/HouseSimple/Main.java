public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Wall theWallA = new Wall("West");
        Wall theWallB = new Wall("East");
        Wall theWallC = new Wall("North");
        Wall theWallD = new Wall("South");

        Ceiling theCeiling = new Ceiling(12, 55);

        Bed theBed = new Bed("Modern", 4, 3, 2, 1);

        Lamp theLamp = new Lamp("Classic", false, 75);

        Bedroom theBedroom = new Bedroom("My Room", theWallA, theWallB, theWallC, theWallD, theCeiling, theBed, theLamp);

        theBedroom.makeBed();
        theBedroom.getItsLamp().turnOn();

    }

}
