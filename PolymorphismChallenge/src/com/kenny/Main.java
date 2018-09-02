package com.kenny;

class Car {

    private String name;
    private boolean engine;
    private double wheels;
    private int amountOfCylinders;
    private double speed;
    private double mileage;



    public Car(String name, int amountOfCylinders) {
        this.name = name;
        this.amountOfCylinders = amountOfCylinders;
        this.engine = true;
        this.wheels = 4;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isEngineRunning() {
        return engine;
    }

    public double getWheels() {
        return wheels;
    }

    public int getAmountOfCylinders() {
        return amountOfCylinders;
    }

    public void startEngine(){
        engine = true;
    }

    public void stopEngine(){
        engine = false;
    }

    public double getSpeed() {
        return speed;
    }

    public double accelerate (double speed){
        this.speed += speed;
        return this.speed;
    }

    public double brake (double speed){
        this.speed -= speed ;
        return this.speed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}

class MercedesBenz extends Car{
    public MercedesBenz() {
        super("Mercedes Benz", 8);
    }

    @Override
    public void setMileage(double mileage) {
        if( mileage > 500000){
            System.out.println("Retire this Mercedes Benz");
        }else{
            System.out.println("The mileage on it is :" + mileage + " Thus she is still usable");
        }
    }
}

class Audi extends Car{
    public Audi(){
        super("Audi",10);
    }
    @Override
    public void setMileage(double mileage) {
        if( mileage > 300000){
            System.out.println("Retire this Audi");
        }else{
            System.out.println("The mileage on it is :" + mileage + " Thus she is still usable");
        }
    }
}

class Ford extends Car{
    public Ford(){
        super("Ford", 6);
    }
    @Override
    public void setMileage(double mileage) {
        if( mileage > 200000){
            System.out.println("Retire this Ford");
        }else{
            System.out.println("The mileage on it is :" + mileage + " Thus she is still usable");
        }
    }
}

class NoOneCares extends Car{
    public NoOneCares(){
        super("Jetta", 4);
    }
    @Override
    public void setMileage(double mileage) {
        if( mileage > 500000){
            System.out.println("Ah it's a Jetta. Just change the oil!");
        }else{
            System.out.println("The mileage on it is :" + mileage + " Thus she is still usable");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        for(int a = 0 ; a < 5 ; a++) {
            Car c1 = giveMeARandomCar();
            System.out.println("\nThe car you won is a " + c1.getName() + " and it has " + c1.getAmountOfCylinders() + " cylinders!");
            int mileage = (int) (Math.random() * 1000000) + 1;
            c1.setMileage(mileage);
        }
    }

    public static Car giveMeARandomCar(){
        int randomNumber = (int) (Math.random() * 4) + 1;

        switch (randomNumber){
            case 1:
                return new MercedesBenz();
            case 2:
                return new Audi();
            case 3:
                return new Ford();
            default:
                return new NoOneCares();
        }
    }
}