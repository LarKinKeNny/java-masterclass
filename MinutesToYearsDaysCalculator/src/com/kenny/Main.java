package com.kenny;


public class Main {

    private static final String INVALID_VALUE_STRING ="Invalid Value";
    public static void main(String[] args) {
	    printYearsAndDays(-9);
    }
    public static void printYearsAndDays(long minutes){
      if(minutes >= 0) {
          long hours = minutes/60;
          long days = hours/24;
          long years = days/365;
          long remDays = days%365;
          System.out.println(minutes + " min = " + years + " y and " + remDays + " d" );

      }else{
          System.out.println(INVALID_VALUE_STRING);
      }

    }
}
