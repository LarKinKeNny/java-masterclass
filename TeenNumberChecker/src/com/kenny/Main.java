package com.kenny;

public class Main {

    public static void main(String[] args) {
        boolean tiener = true;
        tiener = hasTeen(22,23,34);
        System.out.println(tiener);

	// write your code here
    }
    public static boolean hasTeen(int val1, int val2,int val3){
        if((val1 >=13 && val1 <=19) ||( val2 >=13 && val2<=19)||(val3 >=13 && val3<=19)){
           return true;
        }
        return false;
    }
}
