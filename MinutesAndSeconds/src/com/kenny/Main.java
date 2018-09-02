package com.kenny;

public class Main {

    private static final String INVALID_VALUE_STRING = "Invalid Value!";

    public static void main(String[] args) {
        System.out.println(getDurationString(70000,300));
        System.out.println(getDurationString(1000000));
    }

    private static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_STRING;
        }

        int hours = minutes/60;
        int remMinutes = minutes%60;
        String uur,sekonde,minuut;

        if(hours >10) {
            uur = hours + "h ";
        }else {
            uur = "0" + hours + "h ";
        }
        if(remMinutes > 10) {
            minuut = remMinutes + "m ";
        }else {
            minuut = "0" + remMinutes + "m ";
        }
        if(seconds > 10) {
            sekonde = seconds + "s";
        }else{
            sekonde = "0" + seconds + "s";
        }

        return (uur + minuut + sekonde);
    }

    private static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_STRING;
        }
        int minutes = seconds/60;
        int remSeconds = seconds%60;
        return getDurationString(minutes,remSeconds);
    }

}
