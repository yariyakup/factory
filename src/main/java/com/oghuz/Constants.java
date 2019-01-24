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

    // trnsmission types
    public enum TransmissionType{
        automatic, manuel, CVT;
    }

    private static Constants instance;
    private Constants() {}
    public static synchronized Constants Constants(){
        if (instance == null){
            instance = new Constants();
        }
        return instance;
    }
}
