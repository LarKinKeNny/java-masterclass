package com.kenny;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers, hit enter after each entry.");
        int counter = 1, sum = 0;
        while(counter < 11){
            System.out.println("Enter number #" + counter +" : ");
            if(scanner.hasNextInt()){
                sum += scanner.nextInt();
                counter++;
            }else{
                System.out.println("Invalid number, try entering it again.");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("the sum of the entered numbers is: " + sum);
    }

}
