public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");
        Car porsche = new Car(); // Object porsche based on template Car
        Car holden = new Car();
        
        porsche.setModel( "CarRERa" );
        System.out.println( "My car's model: " + porsche.getModel() );
        

    }

}
