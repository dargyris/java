public class Entity {
    
    private String itsName;
    private String itsType;
    private double itsPrice;
    private short itsQty;

    // ============== Constructors ===========

    public Entity(){
        this("Null", "Null", 0.d, (short)0);
    }

    // =========== Setter Constructor ========

    public Entity( String name,
                       String type,
                       double price,
                       short qty){

    	this.itsName = name;
    	this.itsType = type;
    	this.itsPrice = price;
        this.itsQty = qty;

    }

    // =======================================

    public void printProperties(){
        System.out.println( "\t~ " + getClass().getSimpleName() + " Properties ~" );
        System.out.println( "Name\t: " + this.itsName );
        System.out.println( "Type\t: " + this.itsType );
        System.out.println( "Price\t: " + this.itsPrice );
        System.out.println( "Qty\t: " + this.itsQty );
        System.out.println( "-------------------------" );
        System.out.println();
    }

    // =============== Setters ===============

    public void setItsName(String name){
		this.itsName = name;
	}

    public void setItsType(String type){
		this.itsType = type;
	}

    public void setItsPrice(double price){
		this.itsPrice = price;
	}

    public void setItsQty(short qty){
		this.itsQty = qty;
	}

    // =============== Getters ===============

    public String getItsName(){
		return this.itsName;
	}

    public String getItsType(){
		return this.itsType;
	}

    public double getItsPrice(){
		return this.itsPrice;
	}

    public double getItsQty(){
		return this.itsQty;
	}

}
