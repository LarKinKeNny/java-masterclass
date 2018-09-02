package com.kenny;

public class Main {
    private static final int SMALL_BAG = 1;
    private static final int BIG_BAG = 5;

    public static void main(String[] args) {
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount,int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if(((bigCount*BIG_BAG) + (smallCount*SMALL_BAG)) < goal){
            return false;
        }
        int bigRest = goal%5;
        if(bigRest > smallCount){
           return false;
        }
        return true;

    }
}
