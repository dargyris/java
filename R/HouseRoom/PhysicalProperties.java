public class PhysicalProperties {

    private int itsWeight;
    private int itsPieces;
    private String itsMaterial;
    private String itsColor;

    // =======================================

    public PhysicalProperties(){
        this(0, 0, "Null", "Null");
    }

    // ========== Setter Contructor ==========

    public PhysicalProperties( int weight,
                               int pieces,
                               String material,
                               String color){

    	this.itsWeight = weight;
    	this.itsPieces = pieces;
    	this.itsMaterial = material;
    	this.itsColor = color;

    }

    // =======================================

    public void printContent(){
        System.out.println( "PhysProp.itsWeight    0: " + this.itsWeight );
        System.out.println( "PhysProp.itsPieces    0: " + this.itsPieces );
        System.out.println( "PhysProp.itsMaterl    0: " + this.itsMaterial );
        System.out.println( "PhysProp.itsColor     0: " + this.itsColor );
    }

    // =============== Setters ===============

    public void setItsWeight(int weight){
		this.itsWeight = weight;
	}

    public void setItsPieces(int pieces){
		this.itsPieces = pieces;
	}

    public void setItsMaterial(String material){
		this.itsMaterial = material;
	}

    public void setItsColor(String color){
		this.itsColor = color;
	}


    // =============== Getters ===============

    public int getItsWeight(){
		return this.itsWeight;
	}

    public int getItsPieces(){
		return this.itsPieces;
	}

    public String getItsMaterial(){
		return this.itsMaterial;
	}

    public String getItsColor(){
		return this.itsColor;
	}


}
