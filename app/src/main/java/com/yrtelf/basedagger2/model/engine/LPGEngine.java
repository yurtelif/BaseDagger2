package com.yrtelf.basedagger2.model.engine;

import android.util.Log;

import com.yrtelf.basedagger2.model.Engine;

public class LPGEngine implements Engine {

    @Override
    public void turnOn() {
        Log.v("DaggerExample", "LPG Engine turned on");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerExample", "LPG Engine turned off");
    }
}
