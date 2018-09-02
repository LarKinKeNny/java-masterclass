package com.kenny;

public class DeluxeBurger extends Hamburger {
    private static final double DRINK_PRICE = 8.0;
    private static final double CHIPS_PRICE = 7.0;
    private double totalPrice;

    public DeluxeBurger(String breadRollType, boolean meat) {
        super("Deluxe Burger", breadRollType, meat);
        calculateTotalPrice();
    }

    @Override
    public double calculateAdditionsPriceTotal() {
        return DRINK_PRICE + CHIPS_PRICE;
    }

    @Override
    public void setAdditions(boolean lettuce, boolean tomato, boolean chillies, boolean maconPatty) {
        System.out.println("No additions may be made on the Deluxe Burger.");
    }


    @Override
    public void displayBurgerTotal() {
        System.out.println(getHamburgerName() + " Base Price : R" + super.getBasePrice());
        System.out.println("Drink : R" + DRINK_PRICE );
        System.out.println("Chips : R" + CHIPS_PRICE);
        System.out.println("The total comes to : R" + totalPrice);
    }

    @Override
    public void calculateTotalPrice() {
        this.totalPrice = super.getBasePrice() + calculateAdditionsPriceTotal();
    }

}
