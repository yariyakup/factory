package com.oghuz;

import com.oghuz.engine.V8Engine;

public class Factory {
    public static void main(String[] args) {
        V8Engine v8en = new V8Engine(Constants.EngineType.diesel, 6.2, (short) 8, Utility.instance().vinNumber());
        v8en.isEngineRunning = false;
        v8en.startEngine();
        v8en.startEngine();
        v8en.stopEngine();
        v8en.stopEngine();


    }
}
