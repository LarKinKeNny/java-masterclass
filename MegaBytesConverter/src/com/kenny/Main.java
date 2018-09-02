package com.kenny;

public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes >= 0 ){
            int megabytes = kiloBytes/1024;
            int remKiloBytes = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megabytes +
            " MB and " + remKiloBytes + " KB" );
        }else {
            System.out.println("Invalid Value");
        }

    }
}
