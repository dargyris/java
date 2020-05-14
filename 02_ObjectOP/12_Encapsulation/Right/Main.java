public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Player thePlayer = new Player("Diamantis", 100, "Sword");
        System.out.println( "Initial health is " + thePlayer.getItsHealth() );

    }

}
