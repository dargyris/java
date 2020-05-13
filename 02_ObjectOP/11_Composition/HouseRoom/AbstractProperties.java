public class AbstractProperties {

    private short itsIdNumber;
    private String itsState;

    // =======================================

    public AbstractProperties(){
        this((short)0, "Null");
    }

    // ========== Setter Contructor ==========

    public AbstractProperties( short idNumber,
                               String state){

    	this.itsIdNumber = idNumber;
    	this.itsState = state;

    }

    // =======================================

    public void printContent(){
        System.out.println( "AbstrProp.itsIdNumber 0= " + this.itsIdNumber );
        System.out.println( "AbstrProp.itsState    0= " + this.itsState );
    }

    // =============== Setters ===============

    public void setItsIdNumber(short idNumber){
		this.itsIdNumber = idNumber;
	}

    public void setItsState(String state){
		this.itsState = state;
	}


    // =============== Getters ===============

    public short getItsIdNumber(){
		return this.itsIdNumber;
	}

    public String getItsState(){
		return this.itsState;
	}


}
