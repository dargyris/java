public class Lamp {

    private String itsStyle;
    private boolean itsBattery;
    private int itsGlobalRating;

    // ============== Constructors ===========



    // =========== Setter Constructor ========

    public Lamp( String style,
                 boolean battery,
                 int globalRating){

    	this.itsStyle = style;
    	this.itsBattery = battery;
    	this.itsGlobalRating = globalRating;

    }

    // =======================================

    public void turnOn(){
        System.out.println( "lamp -> Turning on." );
    }

    // =============== Setters ===============

    public void setItsStyle(String style){
		this.itsStyle = style;
	}

    public void setItsBattery(boolean battery){
		this.itsBattery = battery;
	}

    public void setItsGlobalRating(int globalRating){
		this.itsGlobalRating = globalRating;
	}


    // =============== Getters ===============

    public String getItsStyle(){
		return this.itsStyle;
	}

    public boolean getItsBattery(){
		return this.itsBattery;
	}

    public int getItsGlobalRating(){
		return this.itsGlobalRating;
	}



}
