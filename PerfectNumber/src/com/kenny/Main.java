package com.kenny;

public class Main {

    public static void main(String[] args) {
        for (int i = 0 ; i < 1000000000; i++ ){
          if(isPerfectNumber(i)){
              System.out.print(i + " ");
          }
        }
    }

    public static boolean isPerfectNumber(int number){
       if(number < 1){
           return false;
       }
       int sum = 0;
       for(int i = 1; i <= (number/2) ; i++){
           if(number%i == 0){
              sum += i;
           }
       }
       if(sum == number){
           return true;
       }
       return false;
    }
}
