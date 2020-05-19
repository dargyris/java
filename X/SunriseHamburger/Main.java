public class Main {

    public static short LOGO = (short)0;
    public static short BURGER = (short)1;
    public static short DELUXE = (short)2;
    public static short SERVE = (short)3;

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Art theArt = new Art();

        Menu theMenu = new Menu();
        boolean mainFlag = true;
        boolean orderAgain = true;
        short menuChoice = -1;
        boolean hasOrdered = false;
        while(mainFlag){
            theArt.printArt(LOGO);
            if(orderAgain){
                menuChoice = (short)theMenu.printMenu();
            }
            switch(menuChoice){
                case 0:
                    theArt.printArt(LOGO);
                    System.out.println( "\n\t\tSunrise Burger\u00A9 will stay here even if you go now." );
                    System.out.println();
                    theArt.wait((short)50);
                    mainFlag = false;
                    break;
                case 1:
                    Hamburger theHamburger = new Hamburger();
                    hasOrdered = theHamburger.order();
                    if(hasOrdered){
                        theHamburger.printReceipt();
                        orderAgain = theHamburger.serve();
                        if(orderAgain){
                            break;
                        }
                        menuChoice = 0;
                        break;
                    } 
                    orderAgain = false;
                    menuChoice = -1;
                    break;
                case 2:
                    Natura theNatura = new Natura();
                    hasOrdered = theNatura.order();
                    if(hasOrdered){
                        theNatura.printReceipt();
                        orderAgain = theNatura.serve();
                        if(orderAgain){
                            break;
                        }
                        menuChoice = 0;
                        break;
                    }
                    orderAgain = false;
                    menuChoice = -1;
                    break;
                case 3:
                    Deluxe theDeluxe = new Deluxe();
                    theDeluxe.printReceipt();
                    orderAgain = theDeluxe.serve();
                    if(orderAgain){
                        break;
                    }
                    menuChoice = 0;
                    break;
                default:
                    theArt.printArt(LOGO);
                    System.out.println( "\t\tAt Sunrise Burger\u00A9 silliness will not be tolerated!" );
                    System.out.println( "\t\tCome back when you're really hungry. (If you want.)" );
                    theArt.wait((short)100);
                    System.out.println();
                    mainFlag = false;
                    break;
            }

        }

    }

}
