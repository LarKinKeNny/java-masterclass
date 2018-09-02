package com.kenny;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9, 18));
    }

    public static int getGreatestCommonDivisor (int number1, int number2){
      if(number1 < 10 || number2 < 10){
          return -1;
      }

      int div1 = 1, div2 = 1, commonDiv = 0;
      for(int i = 1; i <= number1 ; i++){
          if(number1%i == 0){
            div1 = i;
          }
          for(int j = 1; j <= number2 ; j++){
              if(number2%j == 0){
                  div2 = j;
              }
              if(div1 == div2){
                  commonDiv = div1;
              }
          }
      }
      return commonDiv;
    }
}
