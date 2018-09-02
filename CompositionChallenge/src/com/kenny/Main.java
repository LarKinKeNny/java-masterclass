package com.kenny;

public class Main {

    public static void main(String[] args) {

        Room bathroom = new Room(new Furniture("Sink"), new FloorSize(10, 20));
        House crocHouse = new House(bathroom, new FloorSize(120, 600));

        System.out.println("The room has a " + crocHouse.getRoom().getFurniture().getName() + " in it and the floor size of the room is " +
                crocHouse.getRoom().getRoomFloorSize().getSquareMeter());
        System.out.println("The square floor size ot the house is " + crocHouse.getHouseFloorSquare());

    }
}
