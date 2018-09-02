package com.kenny;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99,999));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if(number1 < 10 || number1 > 1000 ||number2 < 10 || number2 > 1000 ||number3 < 10 || number3 > 1000 ){
           return false;
        }
        int digit1, digit2, digit3;

        digit1 = number1%10;
        digit2= number2%10;
        digit3 = number3%10;

        if(digit1 == digit2){
           return true;
        }else if(digit1 == digit3){
            return true;
        }else if (digit2 == digit3){
           return true;
        }
        return false;
    }
}
