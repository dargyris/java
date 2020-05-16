import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

    public static int mainMenu(){

        int threeTries = 3;
        int intChoice = -1;

        while(threeTries > 0){
            WelcomeArt.welcomeArt();
            listChoices();
            intChoice = prompt(threeTries);
            if( intChoice != -1){
                break;
            }
            threeTries--;
        }
        return intChoice;
    }

    public static void listChoices(){
        
        System.out.println( "\t==========================================" );
        System.out.println( "\t\t\t~ Welcome ~" );
        System.out.println( "\t------------------------------------------" );
        System.out.println();
        System.out.println( "\t1. Start New Game" );
        System.out.println( "\t2. Statistics" );
        System.out.println( "\t0. Exit" );
        System.out.println( "\t------------------------------------------" );

    }

    public static int prompt(int threeTries){
        int intChoice = -1;
        switch(threeTries){
            case 3:
                System.out.print( "\t> " );
                intChoice = getInput();
                break;
            case 2: case 1:
                System.out.println( "\tUnknown choice. Please try again.");
                System.out.print( "\t(Rem. tries: " + threeTries + "/3)\n\t> ");
                intChoice = getInput();
                break;
            default:
                // This area should not be reached normally...
                System.out.println( "Panick!");
                break;
        }
        return intChoice;
    }

    public static int getInput(){
        int intChoice = -1;
        Scanner theScanner = new Scanner (System.in);
        boolean isAnInt = theScanner.hasNextInt();

        if(isAnInt){
            intChoice = theScanner.nextInt();
            if(intChoice >= 0 && intChoice <= 2){
                theScanner.nextLine();
                return intChoice;
            }
        }
        theScanner.nextLine();
        return -1;
    }
}
