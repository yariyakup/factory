package com.oghuz.domain;

import com.oghuz.Constants;
import com.oghuz.engine.Engine;

public abstract class Car {
    public String model;
    public String year;
    public Constants.VehicleType vihecleType;
    public Engine engine;
    public String vinNumber;
    public Tire tire;

    public Car(String model, String year, Constants.VehicleType vihecleType, Engine engine, String vinNumber, Tire tire) {
        this.model = model;
        this.year = year;
        this.vihecleType = vihecleType;
        this.engine = engine;
        this.vinNumber = vinNumber;
        this.tire = tire;
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

    public Constants.VehicleType getVihecleType() {
        return vihecleType;
    }

    public void setVihecleType(Constants.VehicleType vihecleType) {
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

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
