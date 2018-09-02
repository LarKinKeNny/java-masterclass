package com.kenny;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, number , numbersEntered = 0;
        while(true){
            System.out.println("Enter number :");
            if(scanner.hasNextInt()){
                numbersEntered++;
                number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }else{
                if(numbersEntered > 0) {
                    break;
                }else {
                    System.out.println("You have not entered any valid numbers");
                    scanner.nextLine();
                }
            }
        }
        System.out.println("The minimum value entered was: " + min);
        System.out.println("The Maximum value entered was: " + max);
        scanner.close();
    }
}
