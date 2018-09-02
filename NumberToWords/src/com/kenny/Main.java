package com.kenny;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(-2001));
    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        int reversedNumber = reverse(number), digit, digitAmount = getDigitCount(number);
        while(digitAmount != 0){
            digit = reversedNumber%10;
            switch (digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber/=10;
            digitAmount--;
        }
    }

    public static int reverse(int number){
        int count = 0;
        if(number < 0){
            count = getDigitCount(-number);
        }else{
            count = getDigitCount(number);
        }
        int digit, reversedNumber = 0;
        while(count > 0){
            count--;
            digit = number % 10;
            reversedNumber = reversedNumber + (digit * (int) Math.pow(10, count));
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int countDigits = 0;
        while(number != 0){
            number /=10;
            countDigits++;
        }
        return countDigits;
    }
}
