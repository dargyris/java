import java.io.IOException;
import java.util.Scanner;

public class Deluxe {

    public static short LOGO = (short)0;
    public static short BURGER = (short)1;
    public static short DELUXE = (short)2;
    public static short SERVE = (short)3;

    private Entity itsEntity;
    private Art itsArt;

    // ============== Constructors ===========
    
    public Deluxe(){
        this( new Entity("Deluxe\u2122 Hamburger", "Hamburger", 57.d, (short)1),             // Entity
              new Art()); // Access to Art
    }

    // =========== Setter Constructor ========

    public Deluxe( Entity entity,
                      Art art){
        this.itsEntity = entity;
        this.itsArt = art;

    }

    // =======================================

    public boolean serve(){
        this.itsArt.printArt(SERVE);
        this.itsArt.load((short)200);
        this.itsArt.printArt(DELUXE);
        this.printServe();
        this.itsArt.interact();
        this.itsArt.printArt(LOGO);
        System.out.println( "\t\tWould you like to reorder?" );
        System.out.println( "\n\t\tYes please! \t--> 1" );
        System.out.println( "\t\tNo thank you.\t--> 0" );
        System.out.print( "\t\t> " );
        short choice = getInput();
        if( choice == (short)1){
            return true;
        }
        return false;
    }

    public short getInput(){
        short choice = -1;
        Scanner theScanner = new Scanner(System.in);
        boolean choiceFlag = theScanner.hasNextInt();
        if(choiceFlag){
            choice = (short)theScanner.nextInt();
            if( choice >= 0 && choice <= 10){
                theScanner.nextLine();
                return choice;
            }
        }
        theScanner.nextLine();
        return -1;
    }

    public void printReceipt(){
        this.itsArt.printArt(LOGO);
        System.out.println( "\t\t\t~ Deluxe\u2122 Hamburger: Receipt ~\n" );
        System.out.println( "\n\t\t-------------------------------------------------" );
        System.out.println( "\t\t\t\t\t\t~ Total: Fr. " + this.itsEntity.getItsPrice() );
        System.out.println( "\t\t=================================================" );
        System.out.print( "\t\t\t\t\t\t> " );
        this.itsArt.interact();
    }

    public void printServe(){
        System.out.println( "\t\t\t~ Deluxe\u2122 Hamburger ~" );
        System.out.println( "\t\tA very special burger with secret ingredients." );
        System.out.println( "\t\tServed with crispy chips and refreshing drinks for you." );
        System.out.println();
        System.out.println( "\t\t\t~ Enjoy! :) ~");
    }

}
