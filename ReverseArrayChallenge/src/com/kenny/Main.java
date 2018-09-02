package com.kenny;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	 int [] array = {5,45,43,2,7899,1,34};
        System.out.println("The array before it is reversed is: " + Arrays.toString(array));
        reverse(array);
        System.out.println("The array after it is reversed is: " + Arrays.toString(array));
    }

    private static void  reverse(int [] array){
        int [] arrayCopy = new int[array.length];
        for(int i = 0; i < array.length; i++){
            arrayCopy[i] = array[array.length - 1 - i];
        }

        for (int i = 0; i < arrayCopy.length; i ++){
            array[i] = arrayCopy[i];
        }
    }
}
