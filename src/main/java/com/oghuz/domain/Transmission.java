package com.oghuz.domain;


import com.oghuz.Constants;

public abstract class Transmission {
    Constants.TransmissionType type;
    Short gearCount;

    Transmission(Constants.TransmissionType type, Short gearCount) {
        this.type = type;
        this.gearCount = gearCount;
    }

    public Constants.TransmissionType getType() {
        return type;
    }

    public void setType(Constants.TransmissionType type) {
        this.type = type;
    }

    public Short getGearCount() {
        return gearCount;
    }

    public void setGearCount(Short gearCount) {
        this.gearCount = gearCount;
    }
}
