package com.oghuz.engine;

enum engineType{
    straight, vType, boxer, rotary, diesel, electric, hybrid;
}
public abstract class Engine {
    engineType type;
    Short fuelCapacity;
    Short cylinderCount;

    public Engine(engineType type, Short fuelCapacity, Short cylinderCount) {
        this.type = type;
        this.fuelCapacity = fuelCapacity;
        this.cylinderCount = cylinderCount;
    }

    public engineType getType() {
        return type;
    }

    public void setType(engineType type) {
        this.type = type;
    }

    public Short getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Short fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Short getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(Short cylinderCount) {
        this.cylinderCount = cylinderCount;
    }
}
