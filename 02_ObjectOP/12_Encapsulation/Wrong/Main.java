public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");    

        Player thePlayer = new Player();
        thePlayer.itsName = "Diamantis";
        thePlayer.itsHealth = 20;
        thePlayer.itsWeapon = "Sword";

        int damage = 10;
        thePlayer.loseHealth(damage);
        System.out.println( "Remaining health: " + thePlayer.healthRemaining() );

        damage = 11;
        thePlayer.itsHealth = 200;
        thePlayer.loseHealth(damage);
        System.out.println( "Remaining health: " + thePlayer.healthRemaining() );
        
    }

}
