package com.kenny;

public class Vehicle {
    private double speed;
    private String name;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void speedUp(double speed){
        if(speed < ( 250 - speed)){
            this.speed += speed;
            System.out.println("Successfully increased vehicle " + name + " speed by " + speed + ". Current speed is " + this.speed);
            return;
        }
        System.out.println("Vehicle "+ name +": speed could not be increased by " + speed + " because " + (this.speed + speed) + " is above the vehicle's max speed (250).");
    }

    public void slowDown(double speed){
        if(speed < this.speed){
            this.speed -= speed;
            System.out.println("Successfully decreased vehicle " + name + " speed by " + speed + ". Current speed is " + this.speed);
            return;
        }
        System.out.println("Vehicle "+ name +": speed could not be decreased by " + speed + " because the speed could not be negative");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
