public class Room {

    private String itsType;
    private int itsArea;
    private int itsHeight;

    // ========== Setter Contructor ==========

    public Room(){
        this("Null", 0, 0);
    }

    public Room( String type,
                 int area,
                 int height){

    	this.itsType = type;
    	this.itsArea = area;
    	this.itsHeight = height;

    }

    // =======================================

    public void printValues(){
        System.out.println( "Type\t: " + this.itsType );
        System.out.println( "Area\t: " + this.itsArea );
        System.out.println( "Height\t: " + this.itsHeight );
    }

    // =============== Setters ===============

    public void setItsType(String type){
		this.itsType = type;
	}

    public void setItsArea(int area){
		this.itsArea = area;
	}

    public void setItsHeight(int height){
		this.itsHeight = height;
	}


    // =============== Getters ===============

    public String getItsType(){
		return this.itsType;
	}

    public int getItsArea(){
		return this.itsArea;
	}

    public int getItsHeight(){
		return this.itsHeight;
	}


}
