package com.kenny;

public class House {
    private Room room;
    private FloorSize houseFloorSize;

    public House(Room room, FloorSize houseFloorSize) {
        this.room = room;
        this.houseFloorSize = houseFloorSize;
    }

    public Room getRoom() {
        return room;
    }
    private FloorSize getHouseFloorSize (){
        return houseFloorSize;
    }

    public double getHouseFloorSquare(){
        return houseFloorSize.getSquareMeter();
    }

}
