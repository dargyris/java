import java.io.IOException;
import java.util.Scanner;

public class Natura extends Hamburger{

    public static short LOGO = (short)0;
    public static short BURGER = (short)1;
    public static short DELUXE = (short)2;
    public static short SERVE = (short)3;
    
    @Override
    public boolean serve(){
        Art theArt = new Art();
        theArt.printArt(SERVE);
        theArt.wait((short)300);
        theArt.printArt(BURGER);
        this.printProperties();
        theArt.wait((short)200);
        theArt.printArt(LOGO);
        System.out.println( "Would you like anything else?" );
        short choice = -1;
        short threeTries = (short)3;
        while(threeTries > 0){
            System.out.println( "1. Yes " );
            System.out.println( "2. No, thank you." );
            this.prompt(threeTries);
            choice = (short)this.getInput();
            if(choice == 1) {
                return true;
            }
            threeTries --;
        }
        return false;
    }

    @Override
    public short order(){
        short choice = -1;
        short threeTries = (short)3;
        while(threeTries > 0){
            this.printOptions();
            this.prompt(threeTries);
            choice = (short)this.getInput();
            if(choice >= 0 && choice <= 6){
                break;
            }
            threeTries --;
        }
        return choice;
    }
    
    @Override
    public void printOptions(){
        Art theArt = new Art();
        theArt.printArt(LOGO);
        System.out.println( "\t~ Natura ~" );
        System.out.println( "\tWith delicious Natura\u2122 bread." );
        System.out.println( "\tYou can add two of the following:" );
        System.out.println();
        System.out.println( "\t1. Natura\u2122 Cow Eggs." );
        System.out.println( "\t2. Natura\u2122 Whale Blubber." );
        System.out.println( "\t3. Natura\u2122 Extra-soft Fox Fur." );
        System.out.println( "\t4. Natura\u2122 Pig Just-new-born babies." );
        System.out.println( "\t5. Natura\u2122 Endangered Penguin tender Meat." );
        System.out.println( "\t6. Natura\u2122 \"The Last Breath of the Fisherman\"." );
        System.out.println( "\t\tA very rare kind of algae, unsusually dangerous to acquire." );
        System.out.println( "\n\t0. That's enough. Thank you." );
    }
    
    @Override
    public short getInput(){
        short choice = -1;
        Scanner theScanner = new Scanner(System.in);
        boolean choiceFlag = theScanner.hasNextInt();
        if(choiceFlag){
            choice = (short)theScanner.nextInt();
            if(choice >= 0 && choice <= 6){
                theScanner.nextLine();
                return choice;
            }
        }
        theScanner.nextLine();
        return choice;
    }

}
