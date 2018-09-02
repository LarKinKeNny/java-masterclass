package com.kenny;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private static int number = 1;

    public BankAccount() {
        this("Default Name", " Default email", "Default phone number", 0);
    }

    public BankAccount(String customerName, String email, String phoneNumber, double balance ) {
        this.accountNumber = ("" + number++);
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double depFunds){
        this.balance += depFunds;
        System.out.println("New balance is: R" + this.balance);
    }

    public boolean withdrawFunds(double withFunds ){
        if(withFunds < this.balance) {
            this.balance -= withFunds;
            System.out.println("Successful withdrawal");
            return true;
        }else{
            System.out.println("Insufficient funds");
            return false;
        }
    }
}
