// Object - Instance - Reference - Class
public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        
        // Reference to object. 
        // Since this is the 1st ref, a New object
        // will be created. Basically a space in
        // memory containing the string "Blue"
        // in conjunction with the blueprint provided
        // by the class.
        House blueHouseRef = new House ("Blue");

        // Reference to the same object
        // from above
        House anotherHouseRef = blueHouseRef;

        // Testing:
        System.out.println( blueHouseRef.getItsColor() );
        System.out.println( anotherHouseRef.getItsColor() );
        
        anotherHouseRef.setItsColor("Red");
        System.out.println( blueHouseRef.getItsColor() );
        System.out.println( anotherHouseRef.getItsColor() );

        House greenHouse = new House("Green");
        anotherHouseRef = greenHouse;

        System.out.println( blueHouseRef.getItsColor() );
        System.out.println( greenHouse.getItsColor() );
        System.out.println( anotherHouseRef.getItsColor() );
    }

}
