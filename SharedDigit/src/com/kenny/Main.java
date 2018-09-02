package com.kenny;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int number1, int number2){
        if(number1 < 10 || number2 < 10 || number1 > 99 || number2 >99 ){
            return false;
        }
        int digit1, digit2;
        while (number1 != 0){
            digit1 = number1%10;
            while(number2 != 0){
               digit2 = number2%10;
               if(digit1 == digit2){
                  return true;
               }
               number2 /=10;
            }
            number1 /=10;
        }
        return false;

    }
}
