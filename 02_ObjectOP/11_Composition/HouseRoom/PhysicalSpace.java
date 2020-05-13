public class PhysicalSpace {

    private short itsVolume;
    private String itsUse;
    private AbstractProperties itsAbstractProperties;

    // =======================================
    
    public PhysicalSpace(){
        this((short)10, "PhysicalSpace", 
             new AbstractProperties());
    }

    // ========== Setter Contructor ==========

    public PhysicalSpace( short volume,
                          String use,
                          AbstractProperties abstractProperties){

    	this.itsVolume = volume;
    	this.itsUse = use;
    	this.itsAbstractProperties = abstractProperties;

    }

    // =======================================

    public void printContent(){
        System.out.println( "\t~ Physical Space! (Parent) ~" );
        System.out.println( "Volume\t: " + this.itsVolume );
        System.out.println( "Use\t: " + this.itsUse );
        System.out.println();
        this.itsAbstractProperties.printContent();
        System.out.println();
    }

    // =============== Setters ===============

    public void setItsVolume(short volume){
		this.itsVolume = volume;
	}

    public void setItsUse(String use){
		this.itsUse = use;
	}

    public void setItsAbstractProperties(AbstractProperties abstractProperties){
		this.itsAbstractProperties = abstractProperties;
	}


    // =============== Getters ===============

    public short getItsVolume(){
		return this.itsVolume;
	}

    public String getItsUse(){
		return this.itsUse;
	}

    public AbstractProperties getItsAbstractProperties(){
		return this.itsAbstractProperties;
	}


}
