public class Dimensions {

    private int itsDepth;
    private int itsHeight;
    private int itsLength;

    // =======================================

    public Dimensions(){
        this(0, 0, 0);
    }

    // ========== Setter Contructor ==========

    public Dimensions( int depth,
                       int height,
                       int length){

    	this.itsDepth = depth;
    	this.itsHeight = height;
    	this.itsLength = length;

    }

    // =======================================

    public void printContent(){
        System.out.println( "Dimensions.itsDepth   0> " + this.itsDepth );
        System.out.println( "Dimensions.itsHeight  0> " + this.itsHeight );
        System.out.println( "Dimensions.itsLength  0> " + this.itsLength );

    }

    // =============== Setters ===============

    public void setItsDepth(int depth){
		this.itsDepth = depth;
	}

    public void setItsHeight(int height){
		this.itsHeight = height;
	}

    public void setItsLength(int length){
		this.itsLength = length;
	}


    // =============== Getters ===============

    public int getItsDepth(){
		return this.itsDepth;
	}

    public int getItsHeight(){
		return this.itsHeight;
	}

    public int getItsLength(){
		return this.itsLength;
	}


}
