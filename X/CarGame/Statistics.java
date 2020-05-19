public class Statistics {

    public static void statistics(User user){
        WelcomeArt.welcomeArt();
        System.out.println( "\tName: " + user.getItsName() );
        System.out.println( "\tMax Speed: " + user.getItsMaxSpeed() );
        Loading.loading();
    }

}
