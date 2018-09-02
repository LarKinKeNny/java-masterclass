package com.kenny;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(500158));
    }

    public static int sumFirstAndLastDigit(int number){
      if(number < 0){
          return -1;
      }
      int first = 0, last = 0;
      first = number % 10;
      while(number != 0){
          last = number%10;
          number /=10;
      }
      return first + last;
    }
}
