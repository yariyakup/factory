package com.oghuz.engine;

import java.util.Random;

enum engineType{
    straight, vType, boxer, rotary, diesel, electric, hybrid;
}
public abstract class Engine {
    engineType type;
    Double fuelCapacity;
    Short cylinderCount;
    String vinNumber;
    final String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public Engine(engineType type, Double fuelCapacity, Short cylinderCount, String vinNumber) {
        this.type = type;
        this.fuelCapacity = fuelCapacity;
        this.cylinderCount = cylinderCount;
        this.vinNumber = generateVinNumber();
    }

    String generateVinNumber(){
        StringBuilder vinNumber = new StringBuilder(17);
        //String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int first3Digit = random.nextInt(900) + 100;
        vinNumber.append(Math.abs(first3Digit));
        for (int i = 0; i < 14; i++) {
            vinNumber.append(alphabetString.charAt(1 + random.nextInt(25)));
        }
        return vinNumber.toString();
    }

    public String engineNumber(){
        Random random = new Random();
        StringBuilder engineNum = new StringBuilder();
        //String alphabeString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        engineNum.append(alphabetString.charAt(1 + random.nextInt(25)));
        engineNum.append(alphabetString.charAt(1 + random.nextInt(25)));
        int fiveDigits = random.nextInt(90000) + 10000;
        engineNum.append(Math.abs(fiveDigits));
        engineNum.append(alphabetString.charAt(1 + random.nextInt(25)));
        int  sevenDigits = random.nextInt(9000000) + 1000000;
        engineNum.append(Math.abs(sevenDigits));
        engineNum.append(alphabetString.charAt(1 + random.nextInt(25)));

        return engineNum.toString();
    }

    public engineType getType() {
        return type;
    }

    public void setType(engineType type) {
        this.type = type;
    }

    public Double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Short getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(Short cylinderCount) {
        this.cylinderCount = cylinderCount;
    }
}
