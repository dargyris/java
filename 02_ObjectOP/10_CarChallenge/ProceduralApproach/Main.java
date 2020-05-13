public class Main {

    public static void main ( String[] args ){

        User theUser = new User();
        Game theGame = new Game();

        boolean myFlag = true;
        while(myFlag){
            int intChoice = MainMenu.mainMenu();
            switch(intChoice){
                case 0:
                    WelcomeArt.welcomeArt();
                    System.out.println( "\tExiting..." );
                    myFlag = false;
                    break;
                case 1:
                    WelcomeArt.welcomeArt();
                    System.out.println( "\tNew Game!" );
                    theUser.setItsName();
                    boolean gameFlag = true;
                    while(gameFlag){
                        gameFlag = theGame.game();
                    }
                    theUser.setItsMaxSpeed(theGame.getItsMaxSpeed());
                    break;
                case 2:
                    WelcomeArt.welcomeArt();
                    Statistics.statistics(theUser);
                    break;
                default:
                    WelcomeArt.welcomeArt();
                    System.out.println( "\n\t~ If you can't find the right button... ~"
                            + "\n\t...then this game might not be for you...");
                    myFlag = false;
                    break;
            }
        }

    }

}
