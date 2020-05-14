public class Human extends Organism{

    private short itsAge;
    private short itsWeight;
    private short itsHeight;
    private String itsGender;
    private String itsName;
    private String itsEyesColor;

    // ============== Constructors ===========

    public Human(){
        this(true, (short)0, (short)0, (short)0, "Human", "Human", "Human");
//        this((short)0, (short)0, (short)0, "Human", "Human", "Human");    
        // If I don't initialize super, it will call
        // it's own empty constructor with its init values.
    }

    // =========== Setter Constructor ========

    public Human( boolean alive,

                  short age,
                  short weight,
                  short height,
                  String gender,
                  String name,
                  String eyesColor){

//        super.isAlive = alive; --> WRONG! Tries to SET value.
        super(alive); // Calls super constructor. Correct.
    	this.itsAge = age;
    	this.itsWeight = weight;
    	this.itsHeight = height;
    	this.itsGender = gender;
    	this.itsName = name;
    	this.itsEyesColor = eyesColor;

    }

    // =======================================
    @Override
    public void printDetails(){
        System.out.println( "\t~ Human: Organism prints...");
        super.printDetails();
        System.out.println();
        System.out.println( "\t~ Human: prints! ~" );
        System.out.println( "Human.itsAge\t: " + this.itsAge );
        System.out.println( "Human.itsWeight\t: " + this.itsWeight );
        System.out.println( "Human.itsHeight\t: " + this.itsHeight );
        System.out.println( "Human.itsGender\t: " + this.itsGender );
        System.out.println( "Human.itsName\t: " + this.itsName );
        System.out.println( "Human.itsEyesCol: " + this.itsEyesColor );
        System.out.println( "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" );
    }

    // =============== Setters ===============

    public void setItsAge(short age){
		this.itsAge = age;
	}

    public void setItsWeight(short weight){
		this.itsWeight = weight;
	}

    public void setItsHeight(short height){
		this.itsHeight = height;
	}

    public void setItsGender(String gender){
		this.itsGender = gender;
	}

    public void setItsName(String name){
		this.itsName = name;
	}

    public void setItsEyesColor(String eyesColor){
		this.itsEyesColor = eyesColor;
	}


    // =============== Getters ===============

    public short getItsAge(){
		return this.itsAge;
	}

    public short getItsWeight(){
		return this.itsWeight;
	}

    public short getItsHeight(){
		return this.itsHeight;
	}

    public String getItsGender(){
		return this.itsGender;
	}

    public String getItsName(){
		return this.itsName;
	}

    public String getItsEyesColor(){
		return this.itsEyesColor;
	}


}
