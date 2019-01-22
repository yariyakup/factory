package com.oghuz.domain;

import com.oghuz.engine.Engine;
// vehicle type
enum VehicleType{
    twoDoorCoupe, fourDoorCoupe, twoDoorTruck, fourDoorTruck, SUV;
}
public abstract class Car {
    public String model;
    public String year;
    public VehicleType vihecleType;
    public Engine engine;

    public Car(String model, String year, VehicleType vihecleType, Engine engine) {
        this.model = model;
        this.year = year;
        this.vihecleType = vihecleType;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public VehicleType getVihecleType() {
        return vihecleType;
    }

    public void setVihecleType(VehicleType vihecleType) {
        this.vihecleType = vihecleType;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
