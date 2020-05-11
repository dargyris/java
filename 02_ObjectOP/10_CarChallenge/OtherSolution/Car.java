public class Car extends Vehicle {

    private int itsWheels;
    private int itsDoors;
    private int itsGears;
    private boolean isManual;
    private int itsCurrentGear;

    public Car( String name,
                String size,
                
                int wheels,
                int doors,
                int gears,
                boolean manual
                /*int currentGear*/){
        super(name, size);

        this.itsWheels = wheels;
        this.itsDoors = doors;
        this.itsGears = gears;
        this.isManual = manual;
        this.itsCurrentGear = 1;
    }


    public int getItsWheels(){
		return this.itsWheels;
	}

    public int getItsDoors(){
		return this.itsDoors;
	}

    public int getItsGears(){
		return this.itsGears;
	}

    public boolean getIsManual(){
		return this.isManual;
	}

    public int getItsCurrentGear(){
		return this.itsCurrentGear;
	}


    public void setItsWheels(int wheels){
		this.itsWheels = wheels;
	}

    public void setItsDoors(int doors){
		this.itsDoors = doors;
	}

    public void setItsGears(int gears){
		this.itsGears = gears;
	}

    public void setIsManual(boolean manual){
		this.isManual = manual;
	}

    public void setItsCurrentGear(int currentGear){
		this.itsCurrentGear = currentGear;
        System.out.println( "Car.setItsCurrentGear(): Changed to " 
                + this.itsCurrentGear + " gear." );
	}

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println( "Car.changeVelocity(): Velocity " 
                + speed + " direction " + direction );
    }


}
