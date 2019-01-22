package com.oghuz.engine;

public class V8Engine extends Engine {
    public V8Engine(engineType type, Short fuelCapacity, Short cylinderCount) {
        super(type, fuelCapacity, cylinderCount);
        type = engineType.vType;
        fuelCapacity = 6.2;
    }
}
