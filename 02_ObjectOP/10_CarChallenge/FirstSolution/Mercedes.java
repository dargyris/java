public class Mercedes extends Car {

    private short itsDoorCount;
    private int itsWeight;
    private short itsWidth;
    private short itsLenght;

    public Mercedes(){
        this("Null", false, (short)0, "Null", 
            (short)0, 0, "Null", (short)0, (short)0, 0,
            (short)0, 0, (short)0, (short)0);
        System.out.println( "~ Empty Mercedes Constructor ~" );
    }

    public Mercedes( String registationNumber,
                     boolean moveState,
                     short damage,
                     String dateOfManufacture,

                     short wheelCount,
                     int displacement,
                     String color,
                     short steering,
                     short gears,
                     int speed,

                     short doorCount,
                     int weight,
                     short width,
                     short length){
        ((Vehicle)this).itsRegistrationNumber = registationNumber;
        ((Vehicle)this).itsMoveState = moveState;
        ((Vehicle)this).itsDamage = damage;
        ((Vehicle)this).itsDateOfManufacture = dateOfManufacture;
        
        // Empty car constructor is called first.
        // then these values replace
        // and finally the car setter constructor.
        ((Car)this).itsWheelCount = wheelCount;
        ((Car)this).itsDisplacement = displacement;
        ((Car)this).itsColor = color;
        ((Car)this).itsSteering = steering;
        ((Car)this).itsGears = gears;
        ((Car)this).itsSpeed = speed;

        this.itsDoorCount = doorCount;
        this.itsWeight = weight;
        this.itsWidth = width;
        this.itsLenght = length;

        System.out.println( "~ Mercedes Setter Constructor ~" );
    }

    public void setItsDoorCount(short doorCount){
        this.itsDoorCount = doorCount;
    }

    public void setItsWeight(int weight){
        this.itsWeight = weight;
    }

    public void setItsWidth(short width){
        this.itsWidth = width;
    }

    public void setItsLength(short length){
        this.itsLenght = length;
    }

    public short getItsDoorCount(){
        return this.itsDoorCount;
    }

    public int getItsWeight(){
        return this.itsWeight;
    }

    public short getItsWidth(){
        return this.itsWidth;
    }

    public short getItsLength(){
        return this.itsLenght;
    }

    @Override
    public void statsPrinter(){
        super.statsPrinter();
        System.out.println();
        System.out.println( "Doors\t: " + this.itsDoorCount );
        System.out.println( "Weight\t: " + this.itsWeight );
        System.out.println( "Width\t: " + this.itsWidth );
        System.out.println( "Length\t: " + this.itsWeight ); 
    }
}
