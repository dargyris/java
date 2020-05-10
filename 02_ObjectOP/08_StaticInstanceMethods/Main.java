public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        StaticMethod.whatIs();
        InstanceMethod.whatIs();
        Decide.decide();

    }

}
