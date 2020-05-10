class StaticInstanceVar {

    private static String itsStaticName;
    private String itsInstanceName;

    public StaticInstanceVar(String name){
        this.itsStaticName = name;
        this.itsInstanceName = name;
    }

    public void printName(){
        System.out.println( "Static name\t: " + this.itsStaticName);
        System.out.println( "Instance name\t: " + this.itsInstanceName );
    }

}
