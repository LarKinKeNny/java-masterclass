package com.kenny;

public class MercedesBenz extends Car {
    private boolean compressor;

    public MercedesBenz() {
        super();
        compressor = true;
    }
    public MercedesBenz(boolean compressor) {
        super();
        this.compressor = compressor;
    }

    public MercedesBenz(String name, boolean handSteering, boolean manualShifting, double speed, int gear, boolean compressor) {
        super(name, handSteering, manualShifting, speed, gear);
        this.compressor = compressor;
    }

    public boolean isCompressor() {
        return compressor;
    }

    public void setCompressor(boolean compressor) {
        this.compressor = compressor;
    }
}
