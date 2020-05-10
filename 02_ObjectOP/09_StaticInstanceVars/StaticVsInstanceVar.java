class StaticVsInstanceVar {

    public static String itsPublicStaticName;
    private static String itsPrivateStaticName;
    public String itsPublicInstanceName;
    private String itsPrivateInstanceName;

    public StaticVsInstanceVar(String name){
        this.itsPublicStaticName = name;
        this.itsPrivateStaticName = name;
        this.itsPublicInstanceName = name;
        this.itsPrivateInstanceName = name;
        System.out.println( "~ Constructor ~" );
    }

    public static void StaticPrintName(){
        System.out.println( "~ Static Print Name ~" );
        System.out.println( "Public static name:\t" + itsPublicStaticName );
        System.out.println( "Private static name:\t" + itsPrivateStaticName );
    }

    public void InstancePrintName(){
        System.out.println( "~ Instance Print Name ~" );
        System.out.println( "Public Static name\t: " + this.itsPublicStaticName);
        System.out.println( "Private Static name\t: " + this.itsPrivateStaticName );
        System.out.println( "Public Instance name\t: " + this.itsPublicInstanceName);
        System.out.println( "Private Instance name\t: " + this.itsPrivateInstanceName );
    }

}
