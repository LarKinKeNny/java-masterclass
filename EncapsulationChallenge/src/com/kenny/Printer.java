package com.kenny;

public class Printer {
    private double tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;
    private boolean pageCompleted = false;
    private int pageNo = 0;
    private boolean cartridgeEmpty = false;
    private boolean firstPage = true;

    public Printer(double tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(double addedToner){
        if((this.tonerLevel + addedToner) <= 100){
            this.tonerLevel += addedToner;
            if(addedToner > 0) {
                cartridgeEmpty = false;
            }
            return;
        }
        this.tonerLevel = 100;
        cartridgeEmpty = false;
    }

    public void printPage(){
        if(tonerLevel > 0) {
            if(firstPage){
                numberOfPagesPrinted++;
                firstPage = false;
            }
            if(duplexPrinter && pageCompleted) {
                numberOfPagesPrinted++;
            }else if (!duplexPrinter){
                numberOfPagesPrinted++;
            }

            tonerLevel--;
            pageNo++;

            if(pageNo%2 != 0){
                pageCompleted = true;
            }

        }else if(!cartridgeEmpty){
            System.out.println("Not enough toner to print all requested pages.");
            cartridgeEmpty = true;
        }
    }

    public double getTonerLevel (){
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
