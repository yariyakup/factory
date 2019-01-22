package com.oghuz.domain;

import com.oghuz.engine.Engine;

public abstract class Car {
    public String model;
    public String year;
    public Engine engine;

    public Car(String model, String year, Engine engine) {
        this.model = model;
        this.year = year;
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
