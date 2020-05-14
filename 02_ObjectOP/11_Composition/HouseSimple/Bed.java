public class Bed {

    private String itsStyle;
    private int itsPillows;
    private int itsHeight;
    private int itsSheets;
    private int itsQuilt;

    // ============== Constructors ===========



    // =========== Setter Constructor ========

    public Bed( String style,
                int pillows,
                int height,
                int sheets,
                int quilt){

    	this.itsStyle = style;
    	this.itsPillows = pillows;
    	this.itsHeight = height;
    	this.itsSheets = sheets;
    	this.itsQuilt = quilt;

    }

    // =======================================

    public void make(){
        System.out.println( "Bed -> Making." );
    }

    // =============== Setters ===============

    public void setItsStyle(String style){
		this.itsStyle = style;
	}

    public void setItsPillows(int pillows){
		this.itsPillows = pillows;
	}

    public void setItsHeight(int height){
		this.itsHeight = height;
	}

    public void setItsSheets(int sheets){
		this.itsSheets = sheets;
	}

    public void setItsQuilt(int quilt){
		this.itsQuilt = quilt;
	}


    // =============== Getters ===============

    public String getItsStyle(){
		return this.itsStyle;
	}

    public int getItsPillows(){
		return this.itsPillows;
	}

    public int getItsHeight(){
		return this.itsHeight;
	}

    public int getItsSheets(){
		return this.itsSheets;
	}

    public int getItsQuilt(){
		return this.itsQuilt;
	}


}
