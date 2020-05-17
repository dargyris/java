public class Hamburger {

    private String itsName;
    private String itsMeat;
    private double itsPrice;
    private String itsBread;

    private String itsAddAName;
    private double itsAddAPrice;

    private String itsAddBName;
    private double itsAddBPrice;

    private String itsAddCName;
    private double itsAddCPrice;

    private String itsAddDName;
    private double itsAddDPrice;

    // ============== Constructors ===========



    // =========== Setter Constructor ========

    public Hamburger( String name,
                      String meat,
                      double price,
                      String bread){

    	this.itsName = name;
    	this.itsMeat = meat;
    	this.itsPrice = price;
    	this.itsBread = bread;

    }

    // =======================================

    public void addHamburgerAdditionA(String name, double price){
        this.itsAddAName = name;
        this.itsAddAPrice = price;
    }

    public void addHamburgerAdditionB(String name, double price){
        this.itsAddBName = name;
        this.itsAddBPrice = price;
    }

    public void addHamburgerAdditionC(String name, double price){
        this.itsAddCName = name;
        this.itsAddCPrice = price;
    }

    public void addHamburgerAdditionD(String name, double price){
        this.itsAddDName = name;
        this.itsAddDPrice = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.itsPrice;
        System.out.println( this.itsName + " hamburger on a " 
                + this.itsBread + " roll with " + this.itsMeat
                + ", price is " + this.itsPrice);
        if(this.itsAddAName != null){
            hamburgerPrice += this.itsAddAPrice;
            System.out.println( "Added " + this.itsAddAName
                    + " for an extra " + this.itsAddAPrice);
        }

        if(this.itsAddBName != null){
            hamburgerPrice += this.itsAddBPrice;
            System.out.println( "Added " + this.itsAddBName
                    + " for an extra " + this.itsAddBPrice);
        }

        if(this.itsAddCName != null){
            hamburgerPrice += this.itsAddCPrice;
            System.out.println( "Added " + this.itsAddCName
                    + " for an extra " + this.itsAddCPrice);
        }

        if(this.itsAddDName != null){
            hamburgerPrice += this.itsAddDPrice;
            System.out.println( "Added " + this.itsAddDName
                    + " for an extra " + this.itsAddDPrice);
        }
        return hamburgerPrice;
    }

    // =============== Setters ===============

    public void setItsName(String name){
		this.itsName = name;
	}

    public void setItsMeat(String meat){
		this.itsMeat = meat;
	}

    public void setItsPrice(double price){
		this.itsPrice = price;
	}

    public void setItsBread(String bread){
		this.itsBread = bread;
	}


    // =============== Getters ===============

    public String getItsName(){
		return this.itsName;
	}

    public String getItsMeat(){
		return this.itsMeat;
	}

    public double getItsPrice(){
		return this.itsPrice;
	}

    public String getItsBread(){
		return this.itsBread;
	}



}
