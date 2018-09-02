package com.kenny;

public class Main {

    public static void main(String[] args) {
	    Hamburger h1 = new Hamburger("Basic Hamburger","White Bread", true);
	    HealthyBurger h2 = new HealthyBurger(false,true,true);
	    DeluxeBurger h3 = new DeluxeBurger("White Bread",true);
	    h1.setAdditions(true,true,true,false);
	    h2.setAdditions(true,true,false,true,true,false);
	    h3.setAdditions(true,false,true,false);
	    h1.displayBurgerTotal();
		System.out.println(	);
		h2.displayBurgerTotal();
		System.out.println();
		h3.displayBurgerTotal();
        System.out.println();
        System.out.println("h1 Base Price : R" + h1.getBasePrice() );
        System.out.println("h2 Base Price : R" + h2.getBasePrice() );
        System.out.println("h3 Base Price : R" + h3.getBasePrice() );
    }
}
