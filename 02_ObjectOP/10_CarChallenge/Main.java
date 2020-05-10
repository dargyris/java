public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Mercedes compressor = new Mercedes();

        compressor.statsPrinter();

        System.out.println( "Main: obj.getGrandpVar Reg. number: " + compressor.getItsRegistrationNumber() );
        System.out.println( "Main: obj.getParentVar Wheel count: " + compressor.getItsWheelCount() );
        System.out.println( "Main: obj.getItsOwnVar Door count : " + compressor.getItsDoorCount() );
    }

}
