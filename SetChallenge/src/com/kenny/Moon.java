package com.kenny;

public class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }

    @Override
    public boolean addSatellites(HeavenlyBody body) {
        return false;
    }
}
