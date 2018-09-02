package com.kenny;

public class Main {

    public static void main(String[] args) {
        BankAccount jack = new BankAccount("John Wick","john@gmail.com", "0820456708", 2000);
        System.out.println(jack.getCustomerName() + " Bank balance is: R" + jack.getBalance());
        jack.depositFunds(500);
        System.out.println(jack.getCustomerName() + " Bank balance is: R" + jack.getBalance());
        jack.withdrawFunds(5000);
        System.out.println(jack.getCustomerName() + " Bank balance is: R" + jack.getBalance());
        jack.withdrawFunds(1800);
        System.out.println(jack.getCustomerName() + " Bank balance is: R" + jack.getBalance());
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        BankAccount a3 = new BankAccount();
        System.out.println(a3.getAccountNumber());
        VipCustomer v1 = new VipCustomer();
        VipCustomer v2 = new VipCustomer("Baby Jack", 100000, "bjack@gmail.com");
        VipCustomer v3 = new VipCustomer("Saartjie",150);
        System.out.println(v1.getName());
        System.out.println(v2.getName());
        System.out.println(v3.getName());
    }
}
