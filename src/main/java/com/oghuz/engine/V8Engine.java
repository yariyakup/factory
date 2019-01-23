package com.oghuz.engine;

public class V8Engine extends Engine {
    public V8Engine(engineType type, Double fuelCapacity, Short cylinderCount, String vinNumber) {
        super(type, fuelCapacity, cylinderCount, vinNumber);
        type = engineType.vType;
        fuelCapacity = 6.2;
        cylinderCount = 8;
        vinNumber = generateVinNumber();
    }

}
