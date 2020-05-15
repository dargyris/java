class Car {

    private boolean itsEngine;
    private int itsCylinders;
    private String itsName;
    private int itsWheels;

    // ============== Constructors ===========

    public Car( int cylinders,
                String name){
        
        this(true, cylinders, name, 4);
    }

    // =========== Setter Constructor ========

    public Car( boolean engine,
                int cylinders,
                String name,
                int wheels){

    	this.itsEngine = engine;
    	this.itsCylinders = cylinders;
    	this.itsName = name;
    	this.itsWheels = wheels;

    }

    // =======================================

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

    // =============== Setters ===============

    public void setItsEngine(boolean engine){
		this.itsEngine = engine;
	}

    public void setItsCylinders(int cylinders){
		this.itsCylinders = cylinders;
	}

    public void setItsName(String name){
		this.itsName = name;
	}

    public void setItsWheels(int wheels){
		this.itsWheels = wheels;
	}


    // =============== Getters ===============

    public boolean getItsEngine(){
		return this.itsEngine;
	}

    public int getItsCylinders(){
		return this.itsCylinders;
	}

    public String getItsName(){
		return this.itsName;
	}

    public int getItsWheels(){
		return this.itsWheels;
	}

}

class Mitsubishi extends Car {

    public Mitsubishi( int cylinders, 
                       String name){

        super(cylinders, name);
    }

    // =======================================

    @Override
    public String startEngine(){
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake(){
        return "Mitsubishi -> brake()";
    }

}

class Toyota extends Car {

    public Toyota( int cylinders, 
                       String name){

        super(cylinders, name);
    }

    // =======================================

    @Override
    public String startEngine(){
        return "Toyota -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake(){
        return "Toyota -> brake()";
    }

}

public class Main {

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        Car theCar = new Car(8, "Car");
        System.out.println( theCar.getItsName() );
        System.out.println( theCar.startEngine() );
        System.out.println( theCar.accelerate() );
        System.out.println( theCar.brake() );
        System.out.println();

        Mitsubishi theMitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println( theMitsubishi.getItsName() );
        System.out.println( theMitsubishi.startEngine() );
        System.out.println( theMitsubishi.accelerate() );
        System.out.println( theMitsubishi.brake() );
        System.out.println();
       
        Toyota theToyota = new Toyota(6, "Carina E, 1600gli");
        System.out.println( theToyota.getItsName() );
        System.out.println( theToyota.startEngine() );
        System.out.println( theToyota.accelerate() );
        System.out.println( theToyota.brake() );
        System.out.println();
        
        // Inline class demonstration
        Car theFord = new Car(6, "Ford Falcon") {
            
            @Override
            public String startEngine(){
                return "Ford -> startEngine()";
            }

            @Override
            public String accelerate(){
                return "Ford -> accelerate()";
            }

            @Override
            public String brake(){
                return "Ford -> brake()";
            }
        };
        System.out.println( theFord.getItsName() );
        System.out.println( theFord.startEngine() );
        System.out.println( theFord.accelerate() );
        System.out.println( theFord.brake() );
        System.out.println();

        Subaru theSubaru = new Subaru(1, "Imbretsa");
        System.out.println( theSubaru.getItsName() );
        System.out.println( theSubaru.startEngine() );
        System.out.println( theSubaru.accelerate() );
        System.out.println( theSubaru.brake() );
        System.out.println();
    }

    // In Main class:
    static class Subaru extends Car {
        private String itsColor;
        
        public Subaru( int cylinders,
                        String name){

            super (cylinders, name);
            this.itsColor = "Crimson";
            
        }

        @Override
        public String startEngine(){
            return getClass().getSimpleName() + " -> startEngine()";
        }

        @Override
        public String accelerate(){
            return getClass().getSimpleName() + " -> accelerate()";
        }

        @Override
        public String brake(){
            return getClass().getSimpleName() + " -> brake()";
        }
    }


}
