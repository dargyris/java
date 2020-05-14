public class Bedroom{

    private String itsName;
    private Wall itsWallA;
    private Wall itsWallB;
    private Wall itsWallC;
    private Wall itsWallD;
    private Ceiling itsCeiling;
    private Bed itsBed;
    private Lamp itsLamp;

    // ============== Constructors ===========



    // =========== Setter Constructor ========

    public Bedroom( String name,
                    Wall wallA,
                    Wall wallB,
                    Wall wallC,
                    Wall wallD,
                    Ceiling ceiling,
                    Bed bed,
                    Lamp lamp){

    	this.itsName = name;
    	this.itsWallA = wallA;
    	this.itsWallB = wallB;
    	this.itsWallC = wallC;
    	this.itsWallD = wallD;
    	this.itsCeiling = ceiling;
    	this.itsBed = bed;
    	this.itsLamp = lamp;

    }

    // =======================================

    public void makeBed(){
        System.out.println( "Bedroom -> making bed." );
        itsBed.make();
    }

    // =============== Setters ===============

    public void setItsName(String name){
		this.itsName = name;
	}

    public void setItsWallA(Wall wallA){
		this.itsWallA = wallA;
	}

    public void setItsWallB(Wall wallB){
		this.itsWallB = wallB;
	}

    public void setItsWallC(Wall wallC){
		this.itsWallC = wallC;
	}

    public void setItsWallD(Wall wallD){
		this.itsWallD = wallD;
	}

    public void setItsCeiling(Ceiling ceiling){
		this.itsCeiling = ceiling;
	}

    public void setItsBed(Bed bed){
		this.itsBed = bed;
	}

    public void setItsLamp(Lamp lamp){
		this.itsLamp = lamp;
	}


    // =============== Getters ===============

    public String getItsName(){
		return this.itsName;
	}

    public Wall getItsWallA(){
		return this.itsWallA;
	}

    public Wall getItsWallB(){
		return this.itsWallB;
	}

    public Wall getItsWallC(){
		return this.itsWallC;
	}

    public Wall getItsWallD(){
		return this.itsWallD;
	}

    public Ceiling getItsCeiling(){
		return this.itsCeiling;
	}

    public Bed getItsBed(){
		return this.itsBed;
	}

    public Lamp getItsLamp(){
		return this.itsLamp;
	}



}
