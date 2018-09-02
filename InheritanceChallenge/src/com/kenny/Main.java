package com.kenny;

public class Main {

    public static void main(String[] args) {
        MercedesBenz c200K = new MercedesBenz(true);
        MercedesBenz c220cdi = new MercedesBenz( "Mercedes c220cdi" , true,true,80,5,false);
        MercedesBenz unknown = new MercedesBenz();
        Car mazda = new Car();
        System.out.println("The Mercedes c200k is driving at : " + c200K.getSpeed() + " in gear no: " + c200K.getGear() +
                (c200K.isCompressor() ? " and is an Compressor"  : " and is not an compressor" ));
        System.out.println("The " + c220cdi.getName()+ " is driving at : " + c220cdi.getSpeed() + " in gear no: " + c220cdi.getGear() +
                (c220cdi.isCompressor() ? " and is an Compressor"  : " and is not an compressor" ));
        System.out.println("The unknown Mercedes is driving at : " + unknown.getSpeed() + " in gear no: " + unknown.getGear() +
                (unknown.isCompressor() ? " and is an Compressor"  : " and is not an compressor" ));
        c200K.shiftDown();
        c200K.shiftDown();
        c200K.shiftDown();
        c200K.shiftDown();
        System.out.println("The Mercedes c200k is driving at : " + c200K.getSpeed() + " in gear no: " + c200K.getGear());
        System.out.println("The Car is driving at : " + mazda.getSpeed() + " in gear no: " + mazda.getGear());
        mazda.shiftDown();
        System.out.println("The Car is driving at : " + mazda.getSpeed() + " in gear no: " + mazda.getGear());
        System.out.println(c200K.getName());
        System.out.println("The Mercedes c200k is driving at : " + c200K.getSpeed() + " in gear no: " + c200K.getGear());
        c200K.slowDown(50);
        System.out.println("The Mercedes c200k is driving at : " + c200K.getSpeed() + " in gear no: " + c200K.getGear());
        c200K.slowDown(20);
        c200K.speedUp(150);
        c200K.speedUp(100);




    }
}
