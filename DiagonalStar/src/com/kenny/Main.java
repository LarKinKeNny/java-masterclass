package com.kenny;

public class Main {

    private static final String SYMBOL_TO_USE = "*";
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number){
        if(number >= 5){
            for(int row = 0; row < number; row++){
                for(int column = 0; column < number; column++){
                    if(row == 0 || row == (number - 1)){
                        System.out.print(SYMBOL_TO_USE);
                    }else if(column == 0|| column ==(number - 1)){
                        System.out.print(SYMBOL_TO_USE);
                    }else if(row == column){
                        System.out.print(SYMBOL_TO_USE);
                    }else if(column == (number - row - 1)){
                        System.out.print(SYMBOL_TO_USE);
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            return;
        }
        System.out.println("Invalid Value");
    }
}
