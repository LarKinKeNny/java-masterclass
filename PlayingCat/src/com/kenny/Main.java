package com.kenny;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        if(temperature>=25 && temperature<=35 && !summer){
            return true;
        }else if(temperature>=25 && temperature<=45 && summer){
            return true;
        }
        return false;
    }
}
