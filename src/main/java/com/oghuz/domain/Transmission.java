package com.oghuz.domain;

public abstract class Transmission {
    String type;
    Short gearCount;

    public Transmission(String type, Short gearCount) {
        this.type = type;
        this.gearCount = gearCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Short getGearCount() {
        return gearCount;
    }

    public void setGearCount(Short gearCount) {
        this.gearCount = gearCount;
    }
}
