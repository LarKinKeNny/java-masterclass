package com.kenny;


public class Hamburger {
    // Burger prices
    private static final double BASE_PRICE = 20.0;
    private static final double LETTUCE_PRICE = 0.5;
    private static final double TOMATO_PRICE = 1.0;
    private static final double CHILLIES_PRICE = 1.5;
    private static final double MACON_PRICE = 4.0;

    private double totalPrice = 0.0;
    private String hamburgerName;
    private String breadRollType;
    private boolean meat;

    //4 additional toppings
    private boolean lettuce;
    private boolean tomato;
    private boolean chillies;
    private boolean maconPatty;

    public Hamburger(String hamburgerName, String breadRollType, boolean meat) {
        this.hamburgerName = hamburgerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public double calculateAdditionsPriceTotal(){
        double total = 0;
        if(lettuce) total+=LETTUCE_PRICE;
        if(tomato) total+=TOMATO_PRICE;
        if(chillies) total+=CHILLIES_PRICE;
        if(maconPatty) total+=MACON_PRICE;
        return total;
    }

    public void setAdditions(boolean lettuce, boolean tomato, boolean chillies, boolean maconPatty){
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.chillies = chillies;
        this.maconPatty = maconPatty;
        calculateTotalPrice();
    }

    public double getBasePrice() {
        return BASE_PRICE;
    }

    public void calculateTotalPrice(){
        this.totalPrice =  BASE_PRICE + calculateAdditionsPriceTotal();
    }

    public void displayBurgerTotal(){
        System.out.println(hamburgerName + " Base Price : R" + getBasePrice());
        if (lettuce) System.out.println("Lettuce : R" + LETTUCE_PRICE);
        if (tomato) System.out.println("Tomato : R" + TOMATO_PRICE);
        if (chillies) System.out.println("Chillies : R" + CHILLIES_PRICE);
        if (maconPatty) System.out.println("Macon Patty : R" + MACON_PRICE);
        System.out.println(displayRest());
    }

    public String displayRest(){
        return ("The total comes to : R" + totalPrice);
    }

    public String getHamburgerName() {
        return hamburgerName;
    }
}
