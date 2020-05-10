public class Car extends Vehicle {

    protected short itsWheelCount;
    protected int itsDisplacement;
    protected String itsColor;
    protected short itsSteering;
    protected short itsGears;
    protected int itsSpeed;

    public Car(){
        this((short)4, 0, "Null", (short)0, (short)0, 0);
        System.out.println( "~ Empty Car Constructor ~" );
    }

    public Car( short wheelCount,
                int displacement,
                String color,
                short steering,
                short gears,
                int speed){
        this.itsWheelCount = wheelCount;
        this.itsDisplacement = displacement;
        this.itsColor = color;
        this.itsSteering = steering;
        this.itsGears = gears;
        this.itsSpeed = speed;
        System.out.println( "~ Car Setter Constructor ~" );
    }

    public void setItsWheelCount(short wheelCount){
        this.itsWheelCount = wheelCount;
    }

    public void setItsDisplacement(int displacement){
        this.itsDisplacement = displacement;
    }

    public void setItsColor(String color){
        this.itsColor = color;
    }

    public void setItsSteering(short steering){
        this.itsSteering = steering;
    }

    public void setItsGears(short gears){
        this.itsGears = gears;
    }

    public void setItsSpeed(int speed){
        this.itsSpeed = speed;
    }

    public short getItsWheelCount(){
        return this.itsWheelCount;
    }

    public int getItsDisplacement(){
        return this.itsDisplacement;
    }

    public String getItsColor(){
        return this.itsColor;
    }

    public short getItsSteering(){
        return this.itsSteering;
    }

    public short getItsGears(){
        return this.itsGears;
    }

    public int getItsSpeed(){
        return this.itsSpeed;
    }
    
    @Override
    public void statsPrinter(){
        super.statsPrinter();
        System.out.println();
        System.out.println( "Wheels\t: " + this.itsWheelCount );
        System.out.println( "Displ.\t: " + this.itsDisplacement + " cm.");
        System.out.println( "Color\t: " + this.itsColor );
        if(this.itsSteering > 0){
            System.out.println( "Steer\t: " + this.itsSteering + " right.");
        } else if (this.itsSteering < 0){
            System.out.println( "Steer\t: " + this.itsSteering + " left.");
        } else {
            System.out.println( "No steering." );
        }
        System.out.println( "Gears\t: " + this.itsGears );
        System.out.println( "Speed\t: " + this.itsSpeed + " km/h");
    }

}
