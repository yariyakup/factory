package com.oghuz.domain;

// trnsmission types
enum TransmissionType{
    automatic, manuel, CVT;
}
public abstract class Transmission {
    TransmissionType type;
    Short gearCount;

    public Transmission(TransmissionType type, Short gearCount) {
        this.type = type;
        this.gearCount = gearCount;
    }

    public TransmissionType getType() {
        return type;
    }

    public void setType(TransmissionType type) {
        this.type = type;
    }

    public Short getGearCount() {
        return gearCount;
    }

    public void setGearCount(Short gearCount) {
        this.gearCount = gearCount;
    }
}
