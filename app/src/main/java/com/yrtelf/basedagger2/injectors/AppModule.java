package com.yrtelf.basedagger2.injectors;


import com.yrtelf.basedagger2.Dagger2Application;
import com.yrtelf.basedagger2.model.Car;
import com.yrtelf.basedagger2.model.Engine;
import com.yrtelf.basedagger2.model.car.BMWCar;
import com.yrtelf.basedagger2.model.engine.PetrolEngine;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application) {
        this.dagger2Application = dagger2Application;
    }

    @Provides @Singleton
    Engine provideEngine(){
        return new PetrolEngine();
    }

    @Provides
    @Singleton
    Car provideCar(Engine engine){
        return new BMWCar(engine);
    }

}
