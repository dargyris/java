public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Room theRoom = new Room();
        theRoom.printValues();
        System.out.println();
        HouseRoom theHouseRoom = new HouseRoom();
        theHouseRoom.printValues();


    }

}
