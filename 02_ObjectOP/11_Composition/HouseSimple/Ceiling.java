public class Ceiling {

    private int itsHeight;
    private int itsPaintedColor;

    // ============== Constructors ===========



    // =========== Setter Constructor ========

    public Ceiling( int height,
                    int paintedColor){

    	this.itsHeight = height;
    	this.itsPaintedColor = paintedColor;

    }

    // =======================================


    // =============== Setters ===============

    public void setItsHeight(int height){
		this.itsHeight = height;
	}

    public void setItsPaintedColor(int paintedColor){
		this.itsPaintedColor = paintedColor;
	}


    // =============== Getters ===============

    public int getItsHeight(){
		return this.itsHeight;
	}

    public int getItsPaintedColor(){
		return this.itsPaintedColor;
	}


}
