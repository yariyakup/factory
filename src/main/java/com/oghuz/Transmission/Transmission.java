package com.oghuz.Transmission;


import com.oghuz.Constants;

public abstract class Transmission {
    private Constants.TransmissionType type;
    private Short gearCount;

    Transmission(Constants.TransmissionType type, Short gearCount) {
        this.type = type;
        this.gearCount = gearCount;
    }

    public Constants.TransmissionType getType() {
        return type;
    }

    public Short getGearCount() {
        return gearCount;
    }

}
