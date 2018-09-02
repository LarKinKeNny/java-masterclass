package com.kenny;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction = new ArrayList<Double>() ;   // boxing
    private double balance;

    Customer(String name, double transaction){
        this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        this.transaction.add(transaction);
        this.balance = transaction;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void addTransaction(double transaction) {
        this.transaction.add(transaction);                              // unboxing
        this.balance += transaction;
    }

    void printStatement(){
        System.out.println("***" + getName()+ "***");
        for (int i = 0; i < transaction.size(); i ++){
            System.out.println(transaction.get(i));
        }
        System.out.println("Balance: R" + balance);
    }
}
