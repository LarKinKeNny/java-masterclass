package com.kenny;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branches> branchList = new ArrayList<Branches>();

    Bank(String name) {
        this.bankName = name;
    }

    boolean validateBranch(String name) {
        for (int i = 0; i < branchList.size(); i++) {
            if (branchList.get(i).getBranchName().toLowerCase().equals(name.toLowerCase())) {

                return false;
            }
        }
        return true;
    }

    void addBranch(String name) {
        Branches branches = new Branches(name.substring(0,1).toUpperCase()
                + name.substring(1).toLowerCase());
        if(validateBranch(name)) {
            branchList.add(branches);
            return;
        }
        System.out.println("Branch already exists");
    }


    private String getBankName() {
        return bankName;
    }

    public void setBankName(String name) {
        this.bankName = name;
    }

    void printBranchList() {
        System.out.println("***" + getBankName() + "***");
        for (int i = 0; i < branchList.size(); i++) {
            System.out.println((i + 1) + "# " + branchList.get(i).getBranchName());
        }

    }


    Branches getBranchesObject(String name){
        for(int i = 0; i < branchList.size(); i ++){
            if(branchList.get(i).getBranchName().toLowerCase().equals(name.toLowerCase())){
                return branchList.get(i);
            }
        }
        return null;
    }

    public ArrayList<Branches> getBranchList() {
        return branchList;
    }

}