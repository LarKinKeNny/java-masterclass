package com.kenny;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is the size of the array you want to create?");
        int count = scanner.nextInt();
        int [] numberArray ;
        numberArray = readIntegers(count);
        System.out.println("The minimum value of the entered values is: "
                + findMin(numberArray));
    }

    public static int [] readIntegers(int count){
        int [] numberArray = new int[count];
        for(int i = 0 ; i < numberArray.length; i++){
            System.out.println("Enter number #" + (i + 1));
            numberArray[i] = scanner.nextInt();
        }
        return numberArray;
    }

    public static int findMin(int[] numberArray){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numberArray.length; i++){
            if(numberArray[i] < smallest){
                smallest = numberArray[i];
            }
        }
        return smallest;
    }
}
