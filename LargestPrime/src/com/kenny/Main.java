package com.kenny;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(450));
        System.out.println(getLargestPrime(280));
        System.out.println(getLargestPrime(7));
    }
/*
    private static int getLargestPrime1(int number){
        if(number <= 1){
            return -1;
        }
        int tempFactor1 = findHighestFactor(number);
        while(!isPrime(tempFactor1)){
            tempFactor1 = findHighestFactor(tempFactor1);
        }
        return tempFactor1;
    }

    private static boolean isPrime(int number){
        int count = 0, p = 0;
        for(int i = 1; i <= number/2; i++){
            if(number%i == 0){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }
    private static int findHighestFactor(int number){
        int factor;
        for(int i = number / 2 ; i >= 2; i--){
            if(number%i == 0){
                factor = i;
                return factor;
            }
        }
        return -1;
    }
*/
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int factor;
        int count;
        for (int i = number ; i >= 1 ; i--) {
           // System.out.println("number%i = " + (number%i));
            if (number % i == 0) {
                factor = i;
                count = 0;
                for(int j = 1; j <= number; j++){
                    if(factor%j == 0){
                        count++;
                    }
                }
               // System.out.println("Counter: " + count);
                if(count == 2){
                    return factor;
                }
            }
        }
        return -1;
    }

}

