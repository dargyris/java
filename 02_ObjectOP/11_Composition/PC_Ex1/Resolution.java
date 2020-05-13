public class Resolution {

    private int itsWidth;
    private int itsHeight;

    // ========== Setter Contructor ==========

    public Resolution( int width,
                       int height){

    this.itsWidth = width;
    this.itsHeight = height;

    }


    // =============== Setters ===============

    public void setItsWidth(int width){
		this.itsWidth = width;
	}

    public void setItsHeight(int height){
		this.itsHeight = height;
	}


    // =============== Getters ===============

    public int getItsWidth(){
		return this.itsWidth;
	}

    public int getItsHeight(){
		return this.itsHeight;
	}



}
