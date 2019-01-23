package com.oghuz.engine;

import com.oghuz.Utility;

enum engineType{
    straight, vType, boxer, rotary, diesel, electric, hybrid;
}
public abstract class Engine {
    engineType type;
    Double fuelCapacity;
    Short cylinderCount;
    String vinNumber;

    public Engine(engineType type, Double fuelCapacity, Short cylinderCount, String vinNumber) {
        this.type = type;
        this.fuelCapacity = fuelCapacity;
        this.cylinderCount = cylinderCount;
        this.vinNumber = Utility.instance().vinNumber();
    }

    public engineType getType() {
        return type;
    }

    public void setType(engineType type) {
        this.type = type;
    }

    public Double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Short getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(Short cylinderCount) {
        this.cylinderCount = cylinderCount;
    }
}
