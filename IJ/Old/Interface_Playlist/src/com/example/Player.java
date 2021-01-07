package com.example;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Player { " + "name='" + name + '\'' +
                ", hitPoints = " + hitPoints +
                ", strength = " + strength +
                ", weapon = '" + weapon + '\'' +
                '}';
    }


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        System.out.print("# ");
        values.add(0, this.name);
        values.add(1, String.valueOf(this.hitPoints));
        values.add(2, String.valueOf(this.strength));
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public boolean read(List<String> savedValues) {
        if (savedValues == null || savedValues.size() == 0) {
            return false;
        }

        this.name = savedValues.get(0);
        this.hitPoints = Integer.parseInt(savedValues.get(1));
        this.strength = Integer.parseInt(savedValues.get(2));
        this.weapon = savedValues.get(3);
        return false;
    }
}
