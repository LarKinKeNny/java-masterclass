package com.kenny;
//Instructor code used for challenge
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0) && item.getAvailableStock() >= quantity) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            item.reserveStock(quantity);
            return inBasket;
        }
        System.out.println("Not added to the basket");
        return 0;
    }

    public void removeFromBasket(StockItem item, int quantity) {
        if(item != null && list.containsKey(item)){
            if(list.get(item) >= quantity){
                if(list.get(item) == quantity){
                    item.releaseReservedStock(quantity);
                    list.remove(item);
                }else{
                    item.releaseReservedStock(quantity);
                    int temp = list.get(item) - quantity;
                    list.replace(item,temp);
                }
            }else{
                System.out.println("There is't so much of that item in your basket");
            }
        }else {
            System.out.println("No such item in your basket");
        }
    }

    public boolean checkout(){
        if(list.isEmpty()){
            System.out.println("There is no items in your basket.");
            return false;
        }
        for(Map.Entry<StockItem, Integer> item : list.entrySet()){
            item.getKey().adjustStock(-(item.getKey().getReservedStock()));
            item.getKey().setReservedStock(0);
        }
        list.clear();
        return true;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
