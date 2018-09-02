package com.kenny;

public class Main {

    public static void main(String[] args) {
        double result;
        result = calcFeetAndInchesToCentimeters(76.70);
        System.out.println(result + " cm");
        result = calcFeetAndInchesToCentimeters(6,0);
        System.out.println(result + " cm");

    }
    private static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeters;
        if(feet >=0 && (inches >= 0 && inches <= 12)){
            centimeters = ((feet*12) + inches)*2.54;
            return centimeters;
        }
        return -1;
    }
    private static double calcFeetAndInchesToCentimeters(double inches){
        double resInches;
        int intInches, intFeet;
        if(inches >= 0){
            intInches = (int) inches;
            intFeet = intInches/12;
            resInches = inches - (intFeet*12);
            return calcFeetAndInchesToCentimeters(((double) intFeet),resInches);
        }
        return -1;
    }

}
