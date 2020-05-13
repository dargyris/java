public class Case {

    private String itsModel;
    private String itsManufacturer;
    private String itsPowerSupply;
    private Dimensions itsDimensions;

    // ========== Setter Contructor ==========

    public Case( String model,
                 String manufacturer,
                 String powerSupply,
                 Dimensions dimensions){

    	this.itsModel = model;
    	this.itsManufacturer = manufacturer;
    	this.itsPowerSupply = powerSupply;
    	this.itsDimensions = dimensions;

    }

    public void pressPowerButton(){
        System.out.println( "Power button pressed." );
    }

    // =============== Setters ===============

    public void setItsModel(String model){
		this.itsModel = model;
	}

    public void setItsManufacturer(String manufacturer){
		this.itsManufacturer = manufacturer;
	}

    public void setItsPowerSupply(String powerSupply){
		this.itsPowerSupply = powerSupply;
	}

    public void setItsDimensions(Dimensions dimensions){
		this.itsDimensions = dimensions;
	}


    // =============== Getters ===============

    public String getItsModel(){
		return this.itsModel;
	}

    public String getItsManufacturer(){
		return this.itsManufacturer;
	}

    public String getItsPowerSupply(){
		return this.itsPowerSupply;
	}

    public Dimensions getItsDimensions(){
		return this.itsDimensions;
	}


}
