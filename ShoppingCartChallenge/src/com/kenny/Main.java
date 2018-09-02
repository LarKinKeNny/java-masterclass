package com.kenny;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86 ,100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket jacksBasket = new Basket("Jack");
        jacksBasket.addToBasket(stockList.get("chair"), 10);
        System.out.println(stockList);
        System.out.println(jacksBasket);

        jacksBasket.checkout();
        System.out.println(jacksBasket);
        System.out.println(stockList);

        temp = new StockItem("chair", 62.0, 5);
        stockList.addStock(temp);

        Basket janetBasket = new Basket("Janet");
        janetBasket.addToBasket(stockList.get("chair"), 4);
        System.out.println("after add to basket");
        System.out.println(stockList);
        janetBasket.removeFromBasket(stockList.get("chair"), 3);
        janetBasket.removeFromBasket(stockList.get("car"), 3);
        System.out.println("after remove from basket");
        System.out.println(stockList);
        System.out.println(janetBasket);
        janetBasket.checkout();
        System.out.println("after checkout");
        System.out.println(janetBasket);
        System.out.println(stockList);

    }


}
