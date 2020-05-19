import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private static short LOGO = (short)0;
    private Art itsArt;

    public Menu(){
        this(new Art());
    }

    public Menu( Art art){
        this.itsArt = art;
    }

    public short printMenu(){
        short choice = -1;
        itsArt.printArt(LOGO);
        System.out.println( "\t\t~ Welcome to Sunrise Burger\u00A9! ~" );
        itsArt.wait((short)50);
        short threeTries = 3;
        while(threeTries > 0){
            itsArt.printArt(LOGO);
            System.out.println( "\t\tHow can we help you today?" );
            System.out.println();
            System.out.println( "\t\tI'd like a..." );
            System.out.println( "\n\t\t1. Build-to-order burger" );
            System.out.println( "\t\t2. Natura" );
            System.out.println( "\t\t3. Deluxe!" );
            System.out.println();
            System.out.println( "\t\t0. Don't want anything..." );
            prompt(threeTries);
            choice = (short)getInput();
            if(choice >= 0 && choice <= 3){
                break;
            }
            threeTries --;
        }
        return choice;
        
    }

    public void prompt(short threeTries){
        switch(threeTries){
            case 3:
                System.out.print( "\n\t\t> " );
                break;
            case 2:
                System.out.println( "\n\t\tWe know you're hungry."
                        + "\n\t\tIt's important to concentrate while"
                        + "\n\t\tyou're placing your order though..." );
                System.out.print( "\n\t\t> " );
                break;
            case 1:
                System.out.println( "\n\t\t...We understand. Just make an effort!" );
                System.out.print( "\n\t\t> " );
                break;
            default:
                System.out.println( "Panic!" ); // Should not be able to get here...
                break;
        }
    }

    public short getInput(){
        short choice = -1;
        Scanner theScanner = new Scanner(System.in);
        boolean inputFlag = theScanner.hasNextInt();
        if(inputFlag){
            choice = (short)theScanner.nextInt();
            if(choice >= 0 && choice <= 3){
                theScanner.nextLine();
                return choice;
            }
        }
        theScanner.nextLine();
        return choice;
    }

}
