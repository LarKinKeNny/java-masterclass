package com.kenny;

public class Star extends HeavenlyBody {
    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.STAR);
    }

    @Override
    public boolean addSatellites(HeavenlyBody planet) {
        if(planet.getBodyTypes() == BodyTypes.PLANET) {
            return super.addSatellites(planet);
        }
        return false;
    }
}
