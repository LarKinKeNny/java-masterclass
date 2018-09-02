package com.kenny;

public class Main {

    public static void main(String[] args) {
        boolean blaf = true;
        blaf = bark(true,1);
        System.out.println(blaf);
        blaf = bark(false,2);
        System.out.println(blaf);
        blaf = bark(true,8);
        System.out.println(blaf);
        blaf = bark(true,-1);
        System.out.println(blaf);
    }
    public static boolean bark(boolean barking, int hourOfDay) {
        if(barking && (hourOfDay < 8 && hourOfDay >= 0 || hourOfDay > 22 && hourOfDay < 24)) {
            return true;
        }
        return false;
    }
}
