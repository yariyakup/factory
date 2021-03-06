package com.oghuz.engine;

import com.oghuz.Constants;

public class V4Engine extends Engine {
    public V4Engine(Constants.EngineType type, Double fuelCapacity, Short cylinderCount, String engineNumver) {
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
