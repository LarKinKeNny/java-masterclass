package com.kenny;

public class Car extends Vehicle {
    private boolean handSteering;
    private boolean manualShifting;
    private int gear;

    public Car() {
        this("Unknown",true,true, 60, 4);
    }

    public Car(String name , boolean handSteering, boolean manualShifting, double speed, int gear) {
        super(name, speed);
        this.handSteering = handSteering;
        this.manualShifting = manualShifting;
        this.gear = gear;
    }

    public boolean isHandSteering() {
        return handSteering;
    }

    public void setHandSteering(boolean handSteering) {
        this.handSteering = handSteering;
    }

    public boolean isManualShifting() {
        return manualShifting;
    }

    public void setManualShifting(boolean manualShifting) {
        this.manualShifting = manualShifting;
    }

    public int getGear() {
        return gear;
    }

    public void shiftUp(){
        if(gear < 6){
            gear++;
            System.out.println("Successfully geared up.");
            return;
        }
        System.out.println("Vehicle already in it's highest gear");
    }
    public void shiftDown(){
        if(gear > 1){
            gear--;
            System.out.println("Successfully geared down.");
            return;
        }
        System.out.println("Vehicle already in it's lowest gear");
    }

}
