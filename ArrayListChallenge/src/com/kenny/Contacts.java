package com.kenny;

class Contacts {
    private String contactName;
    private String contactNumber;

    Contacts() {
    }

    String getContactName() {
        return contactName;
    }

    void setContactName(String contactName) {
        this.contactName = contactName.substring(0,1).toUpperCase() + contactName.substring(1).toLowerCase();
    }

    String getContactNumber() {
        return contactNumber;
    }

    void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
