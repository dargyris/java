public class Motherboard {

    private String itsModel;
    private String itsManufacturer;
    private int itsRamSlots;
    private int itsCardSlots;
    private String itsBios;

    // ========== Setter Contructor ==========

    public Motherboard( String model,
                        String manufacturer,
                        int ramSlots,
                        int cardSlots,
                        String bios){

    this.itsModel = model;
    this.itsManufacturer = manufacturer;
    this.itsRamSlots = ramSlots;
    this.itsCardSlots = cardSlots;
    this.itsBios = bios;

    }

    public void loadProgram(String programName){
        System.out.println( "Program " + programName + " is now Loading..." );
    }

    // =============== Setters ===============

    public void setItsModel(String model){
		this.itsModel = model;
	}

    public void setItsManufacturer(String manufacturer){
		this.itsManufacturer = manufacturer;
	}

    public void setItsRamSlots(int ramSlots){
		this.itsRamSlots = ramSlots;
	}

    public void setItsCardSlots(int cardSlots){
		this.itsCardSlots = cardSlots;
	}

    public void setItsBios(String bios){
		this.itsBios = bios;
	}


    // =============== Getters ===============

    public String getItsModel(){
		return this.itsModel;
	}

    public String getItsManufacturer(){
		return this.itsManufacturer;
	}

    public int getItsRamSlots(){
		return this.itsRamSlots;
	}

    public int getItsCardSlots(){
		return this.itsCardSlots;
	}

    public String getItsBios(){
		return this.itsBios;
	}

}
