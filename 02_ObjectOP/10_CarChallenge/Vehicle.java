public class Vehicle {

    protected String itsRegistrationNumber;
    protected boolean itsMoveState;
    protected short itsDamage;
    protected String itsDateOfManufacture;

    public Vehicle(){
        this("Null", false, (short)0, "Null");
        System.out.println( "~ Empty Vehicle Constructor ~" );
    }

    public Vehicle( String registrationNumber,
                    String dateOfManufacture){
        this(registrationNumber, false, (short)0, dateOfManufacture);
        System.out.println( "~ 2 val Vehicle Constructor ~" );
    }

    public Vehicle( String registrationNumber,
                    boolean moveState,
                    short damage,
                    String dateOfManufacture){
        this.itsRegistrationNumber = registrationNumber;
        this.itsMoveState = moveState;
        this.itsDamage = damage;
        this.itsDateOfManufacture = dateOfManufacture;
        System.out.println( "~ Vehicle Setter Constructor ~" );
    }

    public void statsPrinter(){
        System.out.println( "Regist.\t: " + this.itsRegistrationNumber );
        System.out.println( "Moves?\t: " + this.itsMoveState );
        System.out.println( "Damage\t: " + this.itsDamage );
        System.out.println( "Date\t: " + this.itsDateOfManufacture );
    }

    public void setItsRegistrationNumber(String registrationNumber){
        this.itsRegistrationNumber = registrationNumber;
    }

    public void setItsMoveState(boolean moveState){
        this.itsMoveState = moveState;
    }

    public void setItsDamage(short damage){
        this.itsDamage = damage;
    }

    public void setItsDateOfManufacture(String dateOfManufacture){
        this.itsDateOfManufacture = dateOfManufacture;
    }

    public String getItsRegistrationNumber(){
        return this.itsRegistrationNumber;
    }

    public boolean getItsMoveState(){
        return this.itsMoveState;
    }

    public short getItsDamage(){
        return this.itsDamage;
    }

    public String getItsDateOfManufacture(){
        return this.itsDateOfManufacture;
    }

    public void vehicleStatsPrinter(){
        System.out.println( "Reg. No.\t: " + this.itsRegistrationNumber );
        System.out.println( "Moves?\t: " + this.itsMoveState );
        System.out.println( "Damage\t:" + this.itsDamage );
        System.out.println( "D.O.M.\t: " + this.itsDateOfManufacture);
    }
    
}
