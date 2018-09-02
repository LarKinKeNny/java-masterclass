package com.kenny;
//Course Instructor code used
import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyTypes;

    public enum BodyTypes{
        PLANET,
        STAR,
        MOON
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyTypes) {
        this.satellites = new HashSet<>();
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyTypes = bodyTypes;

    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addSatellites(HeavenlyBody body) {
        return this.satellites.add(body);
    }

    public BodyTypes getBodyTypes() {
        return bodyTypes;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof HeavenlyBody) {
            HeavenlyBody body = ((HeavenlyBody) obj);
            if(this.name.equalsIgnoreCase(body.getName())){
                return this.bodyTypes == body.getBodyTypes();
            }
        }
        return false;

    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + getBodyTypes().hashCode();
    }

    @Override
    public String toString() {
        return this.name + " : " + this.bodyTypes + ", "  + this.orbitalPeriod;
    }
}
