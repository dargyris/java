class StaticInstance {

    private String itsMessage;
    
    // ======================================================
    // Access to the static method: 
    // StaticInstance.printStaticMessage();
    public static void printStaticMessage(){
        System.out.println( "Static message." );
    }
    // ======================================================

    public StaticInstance (String message){
        this.itsMessage = message;
    }

    public void printInstanceMessage(){
        System.out.println( "Instance message: " + this.itsMessage );
    }


}
