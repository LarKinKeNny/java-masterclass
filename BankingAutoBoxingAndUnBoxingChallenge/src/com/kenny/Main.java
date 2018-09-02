package com.kenny;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank absa = new Bank("ABSA");
        boolean quit = false;
        int option;
        printOptions();
        while (!quit) {
            System.out.println("Enter your Option: (7 - > To print these options)");
            option = scanner.nextInt();
            scanner.nextLine();
            String name, customer;
            switch (option) {
                case 1:
                    System.out.println("Please enter the name of the branch you want to create.");
                    String branch = scanner.nextLine();
                    if(absa.validateBranch(branch)) {
                        absa.addBranch(branch);
                    }else{
                        System.out.println("This branch already exists.");
                    }
                    break;

                case 2:
                    System.out.println("Please enter the branch name this customer should belong to.");
                    branch = scanner.nextLine();
                    if(!absa.validateBranch(branch)) {
                        System.out.println("Please enter the Name of the customer.");
                        name = scanner.nextLine();
                        if(absa.getBranchesObject(branch).validateCustomer(name)) {
                            System.out.println("Starting value ?");
                            double value = scanner.nextDouble();
                            scanner.nextLine();
                            absa.getBranchesObject(branch).addCustomer(name, value);
                        }else{
                            System.out.println("This customer account already exists.");
                        }
                    }else{
                        System.out.println("This branch does not exist.");
                    }
                    break;

                case 3:
                        System.out.println("Branch name ?");
                        branch = scanner.nextLine();
                    if(!absa.validateBranch(branch)) {
                        System.out.println("Customer name ?");
                        customer = scanner.nextLine();
                        if(!absa.getBranchesObject(branch).validateCustomer(customer)) {
                            System.out.println("Transaction value ?");
                            double transaction = scanner.nextDouble();
                            scanner.nextLine();
                            absa.getBranchesObject(branch).getCustomerObject(customer).addTransaction(transaction);
                        }else{
                            System.out.println("This customer account does not exist");
                        }
                    }else{
                        System.out.println("Branch does not exist");
                    }
                    break;

                case 4:
                    absa.printBranchList();
                    break;

                case 5:

                    System.out.println("Please enter the branch name");
                    branch = scanner.nextLine();
                    if(!absa.validateBranch(branch)) {
                        absa.getBranchesObject(branch).printCustomerList();
                    }else{
                        System.out.println("This branch does not exist");
                    }
                    break;

                case 6:
                    System.out.println("Branch name ?");
                    branch = scanner.nextLine();
                    if(!absa.validateBranch(branch)) {
                        System.out.println("Customer name ?");
                        customer = scanner.nextLine();
                        if(!absa.getBranchesObject(branch).validateCustomer(customer)) {
                            absa.getBranchesObject(branch).getCustomerObject(customer).printStatement();
                        }else{
                            System.out.println("This customer account does not exist");
                        }
                    }else{
                        System.out.println("This branch does not exist");
                    }
                    break;

                case 7:
                    printOptions();
                    break;

                case 8:
                    quit = true;
                    break;

                default:
                    System.out.println("Invalid Option");
                    printOptions();
                    break;
            }
        }
        scanner.close();
    }

    private static void printOptions() {
        System.out.println("***Options***\n" +
                "1 -> Add a new branch\n" +
                "2 -> Add a customer\n" +
                "3 -> Add a new transaction\n" +
                "4 -> Display list of branches\n" +
                "5 -> Display list of customers\n" +
                "6 -> Display a Customer statement\n" +
                "7 -> Print these options\n" +
                "8 -> Quit");

    }
}

