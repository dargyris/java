class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        StaticInstanceVar myFirstVar = new StaticInstanceVar("Koulis");
        StaticInstanceVar mySecondVar = new StaticInstanceVar("Jeffe");

        myFirstVar.printName();
        System.out.println( "\n" );
        mySecondVar.printName();


    }

}
