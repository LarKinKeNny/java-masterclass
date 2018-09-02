package com.kenny;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone();
        boolean exitFlag = false;
        int index;
        while (!exitFlag){
            String name, number;
            printOptions();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 1:
                    System.out.println("Please enter the name of the Contact to add.");
                    name = scanner.nextLine();
                    try {
                        mobile.findContact(name);
                        System.out.println("There is already a contact with the name: " + name);
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("Now please enter the number.");
                        number = scanner.nextLine();
                        mobile.addContact(name,number);
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the contact to modify");
                    name = scanner.nextLine();
                    try {
                        index = mobile.findIndexOfContact(name);
                        System.out.println("Please enter the new name");
                        name = scanner.nextLine();
                        try {
                            mobile.findContact(name);
                            System.out.println("A contact with this name already exists! Update was not successful");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Please enter the number");
                            number = scanner.nextLine();
                            mobile.modifyContact(index, name, number);
                        }
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("The name of the contact to modify does not exist.");
                    }
                    break;
                case 3:
                    System.out.println("Please enter the name of the contact to remove.");
                    name = scanner.nextLine();
                    try {
                        index = mobile.findIndexOfContact(name);
                        mobile.removeContact(index);
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("There is no contact with that name.");
                    }
                    break;
                case 4:
                    System.out.println("Please enter the name of the contact to find.");
                    name = scanner.nextLine();
                    try {
                        System.out.println("Found " + mobile.findContact(name).getContactName() + ", Number: " + mobile.findContact(name).getContactNumber());
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("There is no contact with that name.");
                    }
                    break;
                case 5 :
                    mobile.printContactList();
                    break;
                case 6:
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }
    }

    private static void printOptions(){
        System.out.println("*****Options*****");
        System.out.println("1- Add new Contact");
        System.out.println("2- Modify Contact");
        System.out.println("3- Remove Contact");
        System.out.println("4- Find Contact");
        System.out.println("5- Display Contact List");
        System.out.println("6- Exit");
    }
}
