package com.oghuz.engine;

import com.oghuz.Constants;

public class V6Engine extends Engine {
    public V6Engine(Constants.EngineType type, Double fuelCapacity, Short cylinderCount, String engineNumver) {
        super(type, fuelCapacity, cylinderCount, engineNumver);
        isEngineRunning = false;
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
