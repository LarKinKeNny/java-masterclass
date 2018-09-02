package com.kenny;

public class Room {
    private Furniture furniture;
    private FloorSize roomFloorSize;

    public Room(Furniture furniture, FloorSize roomFloorSize) {
        this.furniture = furniture;
        this.roomFloorSize = roomFloorSize;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public FloorSize getRoomFloorSize() {
        return roomFloorSize;
    }
}
