public class Vehicle {

    private String itsName;
    private String itsSize;

    private int itsCurrentVelocity;
    private int itsCurrentDirection;

    public Vehicle(String name, String size){
        this.itsName = name;
        this.itsSize = size;

        this.itsCurrentVelocity = 0;
        this.itsCurrentDirection = 0;
    }

    public void steer(int currentDirection){
        this.itsCurrentDirection += currentDirection;
        System.out.println( "Vehicle.steer(): Steering at " 
              + itsCurrentDirection + " degrees." );
    }

    public void move(int velocity, int direction){
        this.itsCurrentVelocity = velocity;
        this.itsCurrentDirection = direction;
        System.out.println( "Vehicle.move(): Moving at " 
                + itsCurrentVelocity + " in direction " 
                + itsCurrentDirection );
    }


    public String getItsName(){
		return this.itsName;
	}

    public String getItsSize(){
		return this.itsSize;
	}

    public int getItsCurrentVelocity(){
		return this.itsCurrentVelocity;
	}

    public int getItsCurrentDirection(){
		return this.itsCurrentDirection;
	}


    public void setItsName(String name){
		this.itsName = name;
	}

    public void setItsSize(String size){
		this.itsSize = size;
	}

    public void setItsCurrentVelocity(int currentVelocity){
		this.itsCurrentVelocity = currentVelocity;
	}

    public void setItsCurrentDirection(int currentDirection){
		this.itsCurrentDirection = currentDirection;
	}

    public void stop(){
        this.itsCurrentVelocity = 0;
    }


}
