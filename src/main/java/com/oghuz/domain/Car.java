package com.oghuz.domain;

import com.oghuz.Constants;
import com.oghuz.engine.Engine;

public abstract class Car {
    private String model;
    private String year;
    private Constants.VehicleType vihecleType;
    private Engine engine;
    private String vinNumber;
    private Tire tire;
    private Transmission transmission;

     Car(String model, String year, Constants.VehicleType vihecleType, Engine engine, String vinNumber, Tire tire, Transmission transmission) {
        this.model = model;
        this.year = year;
        this.vihecleType = vihecleType;
        this.engine = engine;
        this.vinNumber = vinNumber;
        this.tire = tire;
        this.transmission = transmission;
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

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
