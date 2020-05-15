class Car {

    private String itsName;
    private boolean itsEngine;
    private int itsCylinders;
    private int itsWheels;
    private int itsSpeed;

    // ============== Constructors ===========

    public Car(String name, int cylinders, int speed){
        this(name, true, cylinders, 4, speed);
    }

    // =========== Setter Constructor ========

    public Car( String name,
                boolean engine,
                int cylinders,
                int wheels,
                int speed){

    	this.itsName = name;
    	this.itsEngine = engine;
    	this.itsCylinders = cylinders;
    	this.itsWheels = wheels;
        if(speed >= 0 && speed <= 200){
            this.itsSpeed = speed;
        } else {
            this.itsSpeed = -1;
        }

    }

    // =======================================

    public boolean startEngine(){
        System.out.println( "Engine starts." );
        this.itsEngine = true;
        return this.itsEngine;
    }

    public int accelerateCar(int speed){
        if(this.itsSpeed == -1){
            System.out.println( "Invalid speed!" );
            return this.itsSpeed;
        }
        if(this.itsSpeed < 500){
            this.itsSpeed += speed;
            System.out.println( "Car accelerates. New speed: " + this.itsSpeed );
            if(this.itsSpeed >= 500){
                System.out.println( "Max speed reached!" );
            }
        } else {
            System.out.println( "Max speed reached: " + this.itsSpeed );
        }
        return this.itsSpeed;
    }

    public int breakCar(int speed){
        if(this.itsSpeed == -1) {
            System.out.println( "Invalid Speed!" );
            return this.itsSpeed;
        }
        if(this.itsSpeed > 10){
            System.out.println( "Car breaks. New speed: " + this.getItsSpeed() );
            this.itsSpeed -= speed;
        } else {
            System.out.println( "Car stops." );
            this.itsSpeed = 0;
        }
        return this.itsSpeed;
    }


    // =============== Getters ===============

    public String getItsName(){
		return this.itsName;
	}

    public boolean getItsEngine(){
		return this.itsEngine;
	}

    public int getItsCylinders(){
		return this.itsCylinders;
	}

    public int getItsWheels(){
		return this.itsWheels;
	}

    public int getItsSpeed(){
        return this.itsSpeed;
    }

    // ============== Setters ================

    public void setItsName(String name){
		 this.itsName = name;
	}

    public void setItsEngine(boolean engine){
		 this.itsEngine = engine;
	}

    public void setItsCylinders(int cylinders){
		 this.itsCylinders = cylinders;
	}

    public void setItsWheels(int wheels){
		 this.itsWheels = wheels;
	}

    public void setItsSpeed(int speed){
         this.itsSpeed = speed;
    }

}

class Mercedes extends Car {

    public Mercedes(){
        this("Mercedes", false, 16, 4, 30);
    }

    public Mercedes( String name,
                     boolean engine,
                     int cylinders,
                     int wheels,
                     int speed){
        super(name, engine, cylinders, wheels, speed);
    }

    @Override
    public boolean startEngine(){
        System.out.println( "Mercedes engine starts." );
        this.setItsEngine(true);
        return this.getItsEngine();
    }

    @Override
    public int accelerateCar(int speed){
        if(this.getItsSpeed() < 300){
            this.setItsSpeed(this.getItsSpeed() + speed);
            System.out.println( "Mercedes accelerates. New speed: " + this.getItsSpeed() );
            if(this.getItsSpeed() >= 300){
                System.out.println( "Max speed reached!" );
            }
        } else {
            System.out.println( "Max speed reached: " + this.getItsSpeed() );
        }
        return this.getItsSpeed();
    }

    @Override
    public int breakCar(int speed){
        if(this.getItsSpeed() > 5){
            this.setItsSpeed(this.getItsSpeed() - speed);
            System.out.println( "Mercedes breaks. New speed: " + this.getItsSpeed() );
        } else {
            System.out.println( "Mercedes stops." );
            this.setItsSpeed(0);
        }
        return this.getItsSpeed();
    }
}

class Toyota extends Car {

    public Toyota(){
        this("Toyota", false, 14, 4, 20);
    }

    public Toyota( String name,
                     boolean engine,
                     int cylinders,
                     int wheels,
                     int speed){
        super(name, engine, cylinders, wheels, speed);
    }

    @Override
    public boolean startEngine(){
        System.out.println( "Toyota engine starts." );
        this.setItsEngine(true);
        return this.getItsEngine();
    }

    @Override
    public int accelerateCar(int speed){
        if(this.getItsSpeed() < 200){
            this.setItsSpeed(this.getItsSpeed() + speed);
            System.out.println( "Toyota accelerates. New speed: " + this.getItsSpeed() );
            if(this.getItsSpeed() >= 200){
                System.out.println( "Max speed reached!" );
            }
        } else {
            System.out.println( "Max speed reached: " + this.getItsSpeed() );
        }
        return this.getItsSpeed();
    }

    @Override
    public int breakCar(int speed){
        if(this.getItsSpeed() > 5){
            this.setItsSpeed(this.getItsSpeed() - speed);
            System.out.println( "Toyota breaks. New speed: " + this.getItsSpeed() );
        } else {
            System.out.println( "Toyota stops." );
            this.setItsSpeed(0);
        }
        return this.getItsSpeed();
    }

}

class Nissan extends Car {

    public Nissan(){
        this("Nissan", false, 12, 4, 10);
    }

    public Nissan( String name,
                     boolean engine,
                     int cylinders,
                     int wheels,
                     int speed){
        super(name, engine, cylinders, wheels, speed);
    }

    @Override
    public boolean startEngine(){
        System.out.println( "Nissan engine starts." );
        this.setItsEngine(true);
        return this.getItsEngine();
    }

    @Override
    public int accelerateCar(int speed){
        if(this.getItsSpeed() < 100){
            this.setItsSpeed(this.getItsSpeed() + speed);
            System.out.println( "Nissan accelerates. New speed: " + this.getItsSpeed() );
            if(this.getItsSpeed() >= 100){
                System.out.println( "Max speed reached!" );
            }
        } else {
            System.out.println( "Max speed reached: " + this.getItsSpeed() );
        }
        return this.getItsSpeed();
    }

    @Override
    public int breakCar(int speed){
        if(this.getItsSpeed() > 5){
            this.setItsSpeed(this.getItsSpeed() - speed);
            System.out.println( "Nissan breaks. New speed: " + this.getItsSpeed() );
        } else {
            System.out.println( "Nissan stops." );
            this.setItsSpeed(0);
        }
        return this.getItsSpeed();
    }

}

public class Main {


    public static Car randomCar(){
        int randomNumber = (int)(Math.random() * 4) + 1;
        System.out.print( "\t~ Random No. : " + randomNumber + " ---> ");

        switch(randomNumber){
            case 1:
                return new Car("theCar", 28, 500);
            case 2:
                return new Mercedes();
            case 3:
                return new Toyota();
            case 4:
                return new Nissan();
            default:
                return null;
        }
        
    }

    public static void main ( String[] args ){

        System.out.print("\033[H\033[2J");

        System.out.println();
        for(int i = 0; i < 10; i++){
            Car theCar = randomCar();
            System.out.print( "Car #" + i + "\t: " + theCar.getItsName()
                    + "\nEngine\t: " + theCar.getItsEngine()
                    + "\nCyl\t: " + theCar.getItsCylinders()
                    + "\nWheels\t: " + theCar.getItsWheels()
                    + "\nSpeed\t: " + theCar.getItsSpeed()
                    );
            System.out.println();
            theCar.startEngine();
            theCar.accelerateCar(20);
            theCar.breakCar(10);
            System.out.println();
            System.out.println( "=========================================" );
        }
        

    }

}
