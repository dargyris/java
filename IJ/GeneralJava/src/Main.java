class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return "Gears: " + gear + "\nspeed: " + speed;
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
	}

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeat height: " + seatHeight;
    }
}

public class Main {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}