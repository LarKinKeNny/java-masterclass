package com.kenny;


public class Main {
    private static final double MY_PI = 3.14159;
    public static void main(String[] args) {
        System.out.println(area(5.0 , 10));
    }
    private static double area (double radius){
        if(radius <  0){
            return -1.0;
        }
        return MY_PI*radius * radius;
    }

    private static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        return x*y;
    }
}
