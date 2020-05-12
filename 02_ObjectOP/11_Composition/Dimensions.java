public class Dimensions {

    private int itsWidth;
    private int itsHeight;
    private int itsDepth;

    // ========== Setter Contructor ==========

    public Dimensions( int width,
                       int height,
                       int depth){

    this.itsWidth = width;
    this.itsHeight = height;
    this.itsDepth = depth;

    }


    // =============== Setters ===============

    public void setItsWidth(int width){
		this.itsWidth = width;
	}

    public void setItsHeight(int height){
		this.itsHeight = height;
	}

    public void setItsDepth(int depth){
		this.itsDepth = depth;
	}


    // =============== Getters ===============

    public int getItsWidth(){
		return this.itsWidth;
	}

    public int getItsHeight(){
		return this.itsHeight;
	}

    public int getItsDepth(){
		return this.itsDepth;
	}


}
