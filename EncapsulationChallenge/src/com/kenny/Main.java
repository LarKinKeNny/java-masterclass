package com.kenny;

public class Main {

    public static void main(String[] args) {
        Printer HP = new Printer(100, 0, true);
        Printer cannon = new Printer(10, 90, false);
        int numberOfPagesToPrintOnHP = 99;
        int numberOfPagesToPrintOnCannon = 50;
        for(int a = 0; a < numberOfPagesToPrintOnHP; a++){
            HP.printPage();
        }

        for(int i = 0; i < numberOfPagesToPrintOnCannon; i++){
            cannon.printPage();
        }
        System.out.println("Number of papers used on HP:" + HP.getNumberOfPagesPrinted()/2);
        System.out.println("The Toner level of hp is : " + HP.getTonerLevel() +
                ". And the number of completed papers printed is : "+ HP.getNumberOfPagesPrinted()/2);
        HP.fillUpToner(80);
        System.out.println("HP Toner Level:" + HP.getTonerLevel());
        System.out.println("Cannon Toner Level:" + cannon.getTonerLevel());
    }
}
