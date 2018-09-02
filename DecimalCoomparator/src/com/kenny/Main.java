package com.kenny;

public class Main {

    public static void main(String[] args) {
        boolean isEqual = false;
        isEqual = areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(isEqual);
        isEqual = areEqualByThreeDecimalPlaces(3.175,3.176);
        System.out.println(isEqual);
        isEqual = areEqualByThreeDecimalPlaces(3.0,3.0);
        System.out.println(isEqual);
    }
    public static boolean areEqualByThreeDecimalPlaces(double nom1, double nom2){
        int intNom1 = (int) (nom1*1000.0);
        int intNom2 = (int) (nom2*1000.0);
        if(intNom1 == intNom2){
            return true;
        }
        return false;
    }
}
