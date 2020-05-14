public class Organism {

    private boolean isAlive;

    // ============== Constructors ===========

    public Organism(){
        this(true);
    }

    // =========== Setter Constructor ========

    public Organism( boolean alive){

    	this.isAlive = alive;

    }

    // =======================================

    public void printDetails(){
        System.out.println( "Organism -----------------------------------------" );
        System.out.println( "Organism.isAlive: " + this.isAlive );
        System.out.println( "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO" );
    }

    // =============== Setters ===============

    public void setIsAlive(boolean alive){
		this.isAlive = alive;
	}


    // =============== Getters ===============

    public boolean getIsAlive(){
		return this.isAlive;
	}


}
