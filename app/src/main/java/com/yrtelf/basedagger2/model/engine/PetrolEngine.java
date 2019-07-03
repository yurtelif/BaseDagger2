package com.yrtelf.basedagger2.model.engine;

import android.util.Log;

import com.yrtelf.basedagger2.model.Engine;

public class PetrolEngine implements Engine {

    @Override
    public void turnOn() {
        Log.v("DaggerExample", "Petrol Engine turned on");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample", "Petrol Engine turned off");
    }
}
