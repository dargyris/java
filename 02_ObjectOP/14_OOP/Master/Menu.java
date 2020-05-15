import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private static short LOGO = (short)0;

    public Menu(){
        
    }

    public short printMenu(){
        short choice = -1;
        Art theArt = new Art();
        short threeTries = 3;
        while(threeTries > 0){
            System.out.println( "\033[H\033[2J" );
            theArt.printArt(LOGO);
            System.out.println( "\tHow can we help you today?" );
            System.out.println();
            System.out.println( "\tI'd like a..." );
            System.out.println( "\n\t1. Build-to-order burger" );
            System.out.println( "\t2. Natura" );
            System.out.println( "\t3. Deluxe!" );
            System.out.println();
            System.out.println( "\t0. Don't want anything..." );
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
                System.out.print( "\n\t> " );
                break;
            case 2:
                System.out.println( "\n\tWe know you're hungry."
                        + "\n\tIt's important to concentrate while"
                        + "\n\tyou're placing your order though..." );
                System.out.print( "\n\t> " );
                break;
            case 1:
                System.out.println( "\n\t...We understand. Just make an effort!" );
                System.out.println( "\n\t> " );
            default:
                System.out.println();
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
