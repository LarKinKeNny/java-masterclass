package com.kenny;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many values do you want to enter?");
        int arraySize = scanner.nextInt();
        int[] intArray;
        intArray = getIntegers(arraySize);
        System.out.println("The integers you entered are :");
        printArray(intArray);
        int[] requestedCopyOfArray;
        requestedCopyOfArray = sortIntegers(intArray);
        System.out.println("\nThe numbers sorted in descending order are");
        printArray(requestedCopyOfArray);
    }

    public static int[] sortIntegers(int [] intArray){
        int temp;
        for (int i = 1; i < intArray.length ; i ++) {
            for(int j = 0; j < intArray.length -1; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }

    public static int[] getIntegers(int arraySize){
        Scanner scanner = new Scanner(System.in);
        int [] intArray = new int[arraySize];
        for(int i = 0 ; i < intArray.length; i++ ){
            System.out.println("Enter value number #" + (i+1));
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static void printArray(int [] intArray){
        for(int i = 0; i <intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }
}
