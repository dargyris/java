public class HealthyBurger extends Hamburger {

    private String itsHealthyExtraAName;
    private double itsHealthyExtraAPrice;
    private String itsHealthyExtraBName;
    private double itsHealthyExtraBPrice;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAdditionA(String name, double price){
        this.itsHealthyExtraAName = name;
        this.itsHealthyExtraAPrice = price;
    }

    public void addHealthAdditionB(String name, double price){
        this.itsHealthyExtraBName = name;
        this.itsHealthyExtraBPrice = price;
    }

    @Override
    public double itemizeHamburger(){
        double hamburgerPrice = super.itemizeHamburger();
        if(this.itsHealthyExtraAName != null){
            hamburgerPrice += this.itsHealthyExtraAPrice;
            System.out.println( "Added" + this.itsHealthyExtraAName 
                    + " for an extra " + this.itsHealthyExtraAPrice );
        }

        if(this.itsHealthyExtraBName != null){
            hamburgerPrice += this.itsHealthyExtraBPrice;
            System.out.println( "Bdded" + this.itsHealthyExtraBName 
                    + " for an extra " + this.itsHealthyExtraBPrice );
        }

        return hamburgerPrice;
    }
    
}
