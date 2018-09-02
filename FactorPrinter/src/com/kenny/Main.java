package com.kenny;

public class Main {

    public static void main(String[] args) {
        printFactors(32);
    }
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
            return;
        }
        System.out.print("All the factors of "+ number + " are: ");
        for (int i = 1; i <= number; i++){
            if(number%i == 0){
                if(i !=number) {
                    System.out.print(i + ", ");
                }else{
                    System.out.println(i);
                }
            }
        }

    }
}
