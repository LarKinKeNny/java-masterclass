package com.kenny;

public class Main {

    public static void main(String[] args) {
	    boolean jaar = true;
	    jaar = isLeapYear(-1600);
        System.out.println(jaar);
	    jaar = isLeapYear(1600);
        System.out.println(jaar);
	    jaar = isLeapYear(2017);
        System.out.println(jaar);
	    jaar = isLeapYear(2000);
        System.out.println(jaar);
    }
    public static boolean isLeapYear(int year){
        if((year >= 1 && year <= 9999) && ((year%4 == 0) && (year%100 != 0) ||(year%400 == 0))){
            return true;
        }
        return false;
    }
}
