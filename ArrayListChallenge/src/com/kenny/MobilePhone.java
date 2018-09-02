package com.kenny;

import java.util.ArrayList;

class MobilePhone {
    private ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

    private void addObjectContact(Contacts contacts){
        contactsArrayList.add(contacts);
    }

    void addContact(String name, String number){
        Contacts contact = new Contacts();
        contact.setContactName(name);
        contact.setContactNumber(number);
        addObjectContact(contact);
    }

    void removeContact(int index){
        contactsArrayList.remove(index);
    }

    private void modifyObjectContact(int index, Contacts contacts){
        contactsArrayList.set(index,contacts);
    }

    void modifyContact(int index, String name, String number){
        Contacts contact = new Contacts();
        contact.setContactName(name);
        contact.setContactNumber(number);
        modifyObjectContact(index,contact);
    }

    int findIndexOfContact(String name){
        for(int i = 0; i < contactsArrayList.size(); i++ ){
            if(contactsArrayList.get(i).getContactName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }
        return -1;
    }

    private Contacts getContactAt(int index){
        return contactsArrayList.get(index);
    }

    Contacts findContact(String name){
        return getContactAt(findIndexOfContact(name));
    }

    void printContactList(){
        for(int i = 0 ; i < contactsArrayList.size(); i++){
            System.out.println((i+1) + "#" +" Name " + contactsArrayList.get(i).getContactName() +" Number " + contactsArrayList.get(i).getContactNumber());
        }
        if(contactsArrayList.size() == 0){
            System.out.println("No Contacts here!");
        }
    }

}