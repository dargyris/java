public class Monitor {

    private String itsModel;
    private String itsManufacturer;
    private int itsSize;
    private Resolution itsNativeResolution;

    // ========== Setter Contructor ==========

    public Monitor( String model,
                    String manufacturer,
                    int size,
                    Resolution nativeResolution){

    this.itsModel = model;
    this.itsManufacturer = manufacturer;
    this.itsSize = size;
    this.itsNativeResolution = nativeResolution;

    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println( "Drawing pixel at " + x + "," + y
                + " in color " + color );
        
    }

    // =============== Setters ===============

    public void setItsModel(String model){
		this.itsModel = model;
	}

    public void setItsManufacturer(String manufacturer){
		this.itsManufacturer = manufacturer;
	}

    public void setItsSize(int size){
		this.itsSize = size;
	}

    public void setItsNativeResolution(Resolution nativeResolution){
		this.itsNativeResolution = nativeResolution;
	}


    // =============== Getters ===============

    public String getItsModel(){
		return this.itsModel;
	}

    public String getItsManufacturer(){
		return this.itsManufacturer;
	}

    public int getItsSize(){
		return this.itsSize;
	}

    public Resolution getItsNativeResolution(){
		return this.itsNativeResolution;
	}



}
