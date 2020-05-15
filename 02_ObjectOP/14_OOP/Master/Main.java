public class Main {

    public static short REORDER = (short)10;

    public static short LOGO = (short)0;
    public static short BURGER = (short)1;
    public static short DELUXE = (short)2;
    public static short SERVE = (short)3;

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Art theArt = new Art();

        Menu theMenu = new Menu();
        short menuChoice = REORDER;
        boolean mainFlag = true;
        while(mainFlag){

            theArt.printArt(LOGO);
            if(menuChoice == REORDER){              // REORDER -> (short) 10
                menuChoice = theMenu.printMenu();
            }
            switch(menuChoice){
                case 0:
                    theArt.printArt(LOGO);
                    System.out.println( "\nSunrise Burger\u00A9 will stay here even if you go now." );
                    theArt.interact();
                    mainFlag = false;
                    break;
                case 1:
                    Hamburger theHamburger = new Hamburger();
                    boolean hasOrdered = theHamburger.order();
                    if(hasOrdered){
                        menuChoice = (short)theHamburger.serve();
                        break;
                    } 
                    break;
                case 2:
//                    Natura theNatura = new Natura();
//                    menuChoice = (short)theNatura.serve();
                    break;
                case 3:
//                    Deluxe theDeluxe = new Deluxe();
//                    menuChoice = (short)theDeluxe.serve();
                    break;
                default:
                    theArt.printArt(LOGO);
                    System.out.println( "At Sinrise Burger\u00A9 silliness will not be tolerated!" );
                    System.out.println( "Come back when you're really hungry. (If you want.)" );
                    theArt.wait((short)100);
                    System.out.println();
                    mainFlag = false;
                    break;
            }

        }

    }

}
