package org.example.master.collections.sets.challenge;

import java.util.*;


public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        Map<String, Double> planetMap = new LinkedHashMap<>();
        planetMap = Map.of("Mercury", 88d, "Venus", 225d, "Earth", 365d, "Mars", 687d, "Jupiter", 4332d, "Saturn", 10759d, "Uranus", 30660d, "Neptune", 165d);
        for (String planetName : planetMap.keySet()) {
            Planet planet = new Planet(planetName, planetMap.get(planetName));
            solarSystem.put(planet.getName(), planet);
            planets.add(planet);
        }

        Map<String, Double> moonMap = new LinkedHashMap<>();
        moonMap = Map.of("Moon", 27d, "Deimos", 1.3d, "Phobos", 0.3d, "Io", 1.8d, "Europa", 3.5d, "Ganymede", 7.1d, "Callisto", 16.7d);
        for (String moonName : moonMap.keySet()) {
            Moon moon = new Moon(moonName, moonMap.get(moonName));
            solarSystem.put(moon.getName(), moon);
        }

        solarSystem.get("Earth").addSatellite(solarSystem.get("Moon"));

        solarSystem.get("Mars").addSatellite(solarSystem.get("Deimos"));
        solarSystem.get("Mars").addSatellite(solarSystem.get("Phobos"));

        solarSystem.get("Jupiter").addSatellite(solarSystem.get("Io"));
        solarSystem.get("Jupiter").addSatellite(solarSystem.get("Europa"));
        solarSystem.get("Jupiter").addSatellite(solarSystem.get("Ganymede"));
        solarSystem.get("Jupiter").addSatellite(solarSystem.get("Callisto"));

        System.out.println("Moons of Jupiter:");
        for (HeavenlyBody jupiterMoon : solarSystem.get("Jupiter").getSatellites()) {
            System.out.println("\t+ " + jupiterMoon.getName());
        }
        System.out.println("================================================");

        System.out.println();
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }
        System.out.println("================================================");

        System.out.println();
        System.out.println("All moons:");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t* " + moon.getName());
        }
        System.out.println("================================================");
        
        System.out.println();
        DwarfPlanet pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);
        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
        }
    }
}
