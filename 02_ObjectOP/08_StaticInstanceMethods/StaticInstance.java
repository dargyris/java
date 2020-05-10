class StaticInstance {

    private String itsMessage;
    
    // ======================================================
    // Access to the static method: 
    // StaticInstance.printStaticMessage();
    public static void printStaticMessage(){
        System.out.println( "Static message." );
    }
    // ======================================================

    // Constructor
    public StaticInstance (String message){
        this.itsMessage = message;
    }

    // Access to the instance method:
    // <name of object from main()>.printInstanceMessage();
    public void printInstanceMessage(){
        System.out.println( "Instance message: " + this.itsMessage );
    }


}
