class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        StaticVsInstanceVar.itsPublicStaticName = "My Public Static Name";
        StaticVsInstanceVar.StaticPrintName();
        System.out.println();

        StaticVsInstanceVar myFirstInstance = new StaticVsInstanceVar("The First Instance Name!");
        StaticVsInstanceVar.StaticPrintName();
        myFirstInstance.InstancePrintName();
        System.out.println();

        StaticVsInstanceVar mySecondInstance = new StaticVsInstanceVar("The Second Instance Name!");
        StaticVsInstanceVar.StaticPrintName();
        myFirstInstance.InstancePrintName();
        mySecondInstance.InstancePrintName();
        System.out.println();

    }

}
