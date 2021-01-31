package org.example.master.collections.sets.challenge;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final BodyTypes bodyType;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.bodyType = bodyType;
        this.orbitalPeriod = orbitalPeriod;
        satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return satellites.add(moon);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            if(name.equals(((HeavenlyBody) obj).getName())) {
                return bodyType == ((HeavenlyBody) obj).getBodyType();
            }
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return name.hashCode() + 57 + bodyType.hashCode();
    }

    @Override
    public String toString() {
        return name + "\t: " + bodyType + ", " + orbitalPeriod;
    }
}
