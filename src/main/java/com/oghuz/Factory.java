package com.oghuz;

import com.oghuz.engine.V8Engine;

public class Factory {
    public static void main(String[] args) {
        V8Engine v8en = new V8Engine(Constants.EngineType.diesel, 6.2, (short) 8, Utility.instance().vinNumber());
        System.out.println(v8en.getType());
        System.out.println(v8en.getVinNumber());


    }
}
