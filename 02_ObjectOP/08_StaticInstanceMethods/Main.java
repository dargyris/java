class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        StaticInstance.printStaticMessage();

        StaticInstance myInstance = new StaticInstance("Important message here.");
        myInstance.printInstanceMessage();

    }

}
