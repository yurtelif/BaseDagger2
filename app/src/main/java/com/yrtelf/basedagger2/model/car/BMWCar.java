package com.yrtelf.basedagger2.model.car;

import android.util.Log;

import com.yrtelf.basedagger2.model.Car;
import com.yrtelf.basedagger2.model.Engine;

import javax.inject.Inject;

public class BMWCar implements Car {

    Engine engine;


    //@Inject kullanarak Engine arayüzüne sahip bir sınıfı alıyoruz ve Car arayüzüne sahip bir sınıfta kullanıyoruz.
    @Inject
    public BMWCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("DaggerExample","BMW Car is about to start.");
        engine.turnOn();

    }

    @Override
    public void stop() {
        Log.v("DaggerExample","BMW Car is about to stop.");
        engine.turnOff();
    }
}
