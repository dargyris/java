public class Floor {

    private Tiles itsTiles;

    // =======================================

    public Floor(){
        this( new Tiles(
              new Dimensions(2, 2, 2),
              new PhysicalProperties(2, 2, "Floor", "Floor"),
              new AbstractProperties((short)2, "Floor")
              )
              );
    }

    // ========== Setter Contructor ==========

    public Floor( Tiles tiles){

    	this.itsTiles = tiles;

    }

    // =======================================

    public void printContent(){
        System.out.println( "\tFloor! --> " );
        this.itsTiles.printContent();
    }

    // =============== Setters ===============

    public void setItsTiles(Tiles tiles){
		this.itsTiles = tiles;
	}


    // =============== Getters ===============

    public Tiles getItsTiles(){
		return this.itsTiles;
	}


}
