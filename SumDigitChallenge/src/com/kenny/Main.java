package com.kenny;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
    }

    private static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0, digit, newNum = number;
        while(newNum!= 0){
            digit = newNum%10;
            sum += digit;
            newNum /= 10;
        }
        return sum;
    }
}
