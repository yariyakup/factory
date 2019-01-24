package com.oghuz;

public class Constants {
    // engine types
    public enum EngineType{
        straight, vType, boxer, rotary, diesel, electric, hybrid;
    }

    // vehicle type
    public enum VehicleType{
        twoDoorCoupe, fourDoorCoupe, twoDoorTruck, fourDoorTruck, SUV;
    }

    private static Constants getInstance;
    private Constants() {}
    public static synchronized Constants Constants(){
        if (getInstance == null){
            getInstance = new Constants();
        }
        return getInstance;
    }
}
