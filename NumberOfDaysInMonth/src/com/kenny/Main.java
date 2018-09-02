package com.kenny;

public class Main {

    public static void main(String[] args) {
        System.out.println (getDaysInMonth(2, 2020));
    }

    public static boolean isLeapYear (int year){
        if(year >=1 && year <=9999){
            int remYearFour = year%4, remYearHundred = year%100, remYearFourHundred = year%400;
            if ((remYearFour == 0 && remYearHundred != 0) || remYearFourHundred == 0){
                return true;
            }
            return false;
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year){
        if(month < 1 || month >12 || year < 1 || year > 9999){
            return -1;
        }

        if(month == 2 && isLeapYear(year)){
            return 29;
        }

        switch (month){
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }
}
