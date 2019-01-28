package com.oghuz.engine;

import com.oghuz.Constants;

public abstract class Engine {
    private Constants.EngineType type;
    private Double fuelCapacity;
    private Short cylinderCount;
    private String engineNumver;


    Engine(Constants.EngineType type, Double fuelCapacity, Short cylinderCount, String engineNumver) {
        this.type = type;
        this.fuelCapacity = fuelCapacity;
        this.cylinderCount = cylinderCount;
        this.engineNumver = engineNumver;
    }
    protected boolean isEngineRunning = false;

    protected boolean startEngine() {
        if (isEngineRunning){
            System.out.println("the Engine is already at running");
            return false;
        }else {
            System.out.println("Engine is starting now with fuel consumption of : " + fuelCapacity);
            isEngineRunning = true;
            return true;
        }
    }

    protected boolean stopEngine(){
        if (isEngineRunning){
            System.out.println("Engine is stopping now");
            isEngineRunning = false;
            return true;
        }else {
            System.out.println("Engine is already at stop");
            return false;
        }
    }

    public Constants.EngineType getType() {
        return type;
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

    public String getEngineNumver() {
        return engineNumver;
    }

    public void setEngineNumver(String vinNumber) {
        this.engineNumver = vinNumber;
    }
}
