package com.kenny;

public class FloorSize {
    private double squareMeter;
    private double width;
    private double depth;

    public FloorSize(double width, double depth) {
        this.width = width;
        this.depth = depth;
        squareMeter = width*depth;
    }

    public double getSquareMeter(){
        return squareMeter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
