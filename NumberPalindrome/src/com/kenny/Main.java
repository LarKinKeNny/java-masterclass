package com.kenny;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(45654));
    }

    public static boolean isPalindrome (int number){
        if(number < 0){
            number = number * -1;
        }
        int digit, newNumber = number;
        String strRev = "", strNum = "" + number;
        while (newNumber != 0){
            digit = newNumber % 10;
            newNumber /=10;
            strRev += digit;
        }

        if(strNum.compareTo(strRev) == 0){
            return true;
        }else{
            return false;
        }
    }
}
