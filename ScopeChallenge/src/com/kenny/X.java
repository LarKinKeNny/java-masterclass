package com.kenny;

import java.util.Scanner;

public class X {
    private int x = 0;

    public X() {
        this.x =x();
        for(int x = 1; x <13; x++){
            System.out.println( this.x + "*" + x + "="  + (this.x * x));
        }
    }

    public static int x(){
        System.out.println("Enter the number for the times table");
        Scanner x = new Scanner(System.in);
        return x.nextInt();
    }
}
