package com.kenny;

import java.util.ArrayList;

class Branches {
    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    private String branchName;

    Branches(String branchName){
        this.branchName = branchName;
    }

    void addCustomer(String name, double initialTransaction){
        Customer customer = new Customer((name.substring(0,1).toUpperCase()
                + name.substring(1).toLowerCase()),initialTransaction);
        if(validateCustomer(name)) {
            customerList.add(customer);
        }
    }

    boolean validateCustomer(String name){
        for (int i = 0; i < customerList.size(); i++){
            if(customerList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return false;
            }
        }
        return true;
    }


    Customer getCustomerObject(String name){
        for(int i = 0; i < customerList.size(); i ++){
            if(customerList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return customerList.get(i);
            }
        }
        return null;
    }

    String getBranchName() {
        return branchName;
    }

    void printCustomerList(){
        System.out.println("***" + getBranchName()+ "***");
        for (int i = 0; i < customerList.size(); i ++){
            System.out.println((i+1) + "# " + customerList.get(i).getName());
        }
    }
}
