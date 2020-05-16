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

    public void printServe(){
        System.out.println( "\t\t" + this.itsName + "\t(Qty: " +  this.itsQty + ")" );
    }

    public void printReceipt(){
        System.out.println( "\t\t" + this.itsName + "\tQty: " + this.itsQty + "\tFr. " +  (this.itsQty * this.itsPrice) );
    }

    public double returnPrice(){
        return (this.itsQty * this.itsPrice);
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
