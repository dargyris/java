package org.example;

import java.util.ArrayList;

// Non static or inner classes have access to every field and method of the outer class.
// Very good for organization and segregation of parameters.
// NS_Gearbox.Gear first = gearbox.new Gear(1, 12.3);

public class NS_Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public NS_Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public class Gear {
        private int gearNumber;
        private double ratio;
        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}