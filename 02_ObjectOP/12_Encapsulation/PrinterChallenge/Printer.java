public class Printer {

    private int itsTonerLevel;
    private int itsTonerCapacity;
    private int itsPrintedPages;
    private boolean isDuplex;

    // ============== Constructors ===========



    // =========== Setter Constructor ========

    public Printer( int tonerLevel,
                    int tonerCapacity,
                    int printedPages,
                    boolean duplex){

    	this.itsTonerLevel = tonerLevel;
        this.itsTonerCapacity = tonerCapacity;
    	this.itsPrintedPages = printedPages;
    	this.isDuplex = duplex;

    }

    // =======================================

    public void fillToner(int amount){
        int canTake = this.itsTonerCapacity - this.itsTonerLevel;
        if( amount > canTake){ 
            this.itsTonerLevel = this.itsTonerCapacity;
            System.out.println( "You get " + (amount - canTake) + "ml. back." );
        } else  {
            this.itsTonerLevel += amount;
        }
        int currentLevel = (this.itsTonerLevel/this.itsTonerCapacity) * 100;
        System.out.println( "Current level: " + currentLevel + "%.");
    }

    public void printPage(int pages){
        if(this.isDuplex){
            System.out.print( "Duplex Printer: " );
            this.itsPrintedPages += pages/2;
        } else {
            System.out.print( "Single-page Printer: " );
            this.itsPrintedPages += pages;
        }
        System.out.println( "You have printed " + this.itsPrintedPages + " pages so far." );
    }

    // =============== Setters ===============

    public void setItsTonerLevel(int tonerLevel){
		this.itsTonerLevel = tonerLevel;
	}

    public void setItsPrintedPages(int printedPages){
		this.itsPrintedPages = printedPages;
	}

    public void setIsDuplex(boolean duplex){
		this.isDuplex = duplex;
	}


    // =============== Getters ===============

    public int getItsTonerLevel(){
		return this.itsTonerLevel;
	}

    public int getItsPrintedPages(){
		return this.itsPrintedPages;
	}

    public boolean getIsDuplex(){
		return this.isDuplex;
	}




}
