package com.oghuz.engine;

import com.oghuz.Constants;

public abstract class Engine {
    Constants.EngineType type;
    Double fuelCapacity;
    Short cylinderCount;
    String engineNumver;


    public Engine(Constants.EngineType type, Double fuelCapacity, Short cylinderCount, String engineNumver) {
        this.type = type;
        this.fuelCapacity = fuelCapacity;
        this.cylinderCount = cylinderCount;
        this.engineNumver = engineNumver;
    }

    public Constants.EngineType getType() {
        return type;
    }

    public void setType(Constants.EngineType type) {
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

    public String getEngineNumver() {
        return engineNumver;
    }

    public void setEngineNumver(String vinNumber) {
        this.engineNumver = vinNumber;
    }
}
