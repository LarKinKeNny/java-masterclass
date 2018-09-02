package com.kenny;

public class HealthyBurger extends Hamburger {

    private static final double BEAN_PRICE = 1.3;
    private static final double CARROTS_PRICE = 2.0;


    //2 additional extras for a healthy burger
    private boolean beans;
    private boolean carrots;

    private double totalPrice;

    public HealthyBurger(boolean meat, boolean beans, boolean carrots) {
        super("Healthy Burger", "Brown Rye Bread Roll", meat);
    }

    @Override
    public double calculateAdditionsPriceTotal() {
        double total = super.calculateAdditionsPriceTotal();
        if(beans) total += BEAN_PRICE;
        if(carrots) total += CARROTS_PRICE;
        return total;
    }

    public void setAdditions(boolean lettuce, boolean tomato, boolean chillies, boolean maconPatty, boolean beans, boolean carrots){
        super.setAdditions(lettuce,tomato,chillies,maconPatty);
        this.beans = beans;
        this.carrots = carrots;
        calculateTotalPrice();
    }

    @Override
    public void setAdditions(boolean lettuce, boolean tomato, boolean chillies, boolean maconPatty) {
        super.setAdditions(lettuce,tomato,chillies,maconPatty);
        this.beans = false;
        this.carrots = false;
        calculateTotalPrice();
    }

    @Override
    public void displayBurgerTotal() {
        super.displayBurgerTotal();
    }

    @Override
    public String displayRest() {
        String rest = "";
        if (beans) rest += "Beans : R" + BEAN_PRICE + "\n";
        if (carrots) rest += "Carrots : R" + CARROTS_PRICE + "\n";
        rest += ("The total comes to : R" + totalPrice);
        return rest;
    }

    @Override
    public void calculateTotalPrice() {
        this.totalPrice = super.getBasePrice() + calculateAdditionsPriceTotal();
    }
}
