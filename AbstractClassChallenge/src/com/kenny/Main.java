package com.kenny;

public class Main {

    public static void main(String[] args) {
        MyLinkList list = new MyLinkList(null);
        list.step(list.getRoot());
        String stringData = "Johannesburg Durban Bloemfontein Trichardt Bethal Secunda Boksburg Boksburg";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addObject(new ConcreteLinkList(s));
        }

        list.step(list.getRoot());
        list.removeObject(new ConcreteLinkList("Bethal"));
        list.step(list.getRoot());

    }
}
