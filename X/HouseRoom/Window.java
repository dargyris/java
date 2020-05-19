public class Window {

    private Dimensions itsDimensions;
    private PhysicalProperties itsPhysicalProperties;
    private AbstractProperties itsAbstractProperties;

    // =======================================

    public Window(){
        this( new Dimensions(1, 1, 1),
              new PhysicalProperties(1, 1, "Window", "Window"),
              new AbstractProperties((short)1, "Window")
              );
    }

    // ========== Setter Contructor ==========

    public Window( Dimensions dimensions,
                   PhysicalProperties physicalProperties,
                   AbstractProperties abstractProperties){

    	this.itsDimensions = dimensions;
    	this.itsPhysicalProperties = physicalProperties;
    	this.itsAbstractProperties = abstractProperties;

    }

    // =======================================

    public void printContent(){
        System.out.println( "\t\tWindow! ~ " );
        this.itsDimensions.printContent();
        System.out.println();
        this.itsPhysicalProperties.printContent();
        System.out.println();
        this.itsAbstractProperties.printContent();
        System.out.println();
    }

    // =============== Setters ===============

    public void setItsDimensions(Dimensions dimensions){
		this.itsDimensions = dimensions;
	}

    public void setItsPhysicalProperties(PhysicalProperties physicalProperties){
		this.itsPhysicalProperties = physicalProperties;
	}

    public void setItsAbstractProperties(AbstractProperties abstractProperties){
		this.itsAbstractProperties = abstractProperties;
	}


    // =============== Getters ===============

    public Dimensions getItsDimensions(){
		return this.itsDimensions;
	}

    public PhysicalProperties getItsPhysicalProperties(){
		return this.itsPhysicalProperties;
	}

    public AbstractProperties getItsAbstractProperties(){
		return this.itsAbstractProperties;
	}


}
