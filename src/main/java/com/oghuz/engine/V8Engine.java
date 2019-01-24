package com.oghuz.engine;

import com.oghuz.Constants;

public class V8Engine extends Engine {
    public V8Engine(Constants.EngineType type, Double fuelCapacity, Short cylinderCount, String engineNumver) {
        super(type, fuelCapacity, cylinderCount, engineNumver);
    }

    @Override
    public boolean startEngine() {
        return super.startEngine();
    }

    @Override
    public boolean stopEngine() {
        return super.stopEngine();
    }
}
