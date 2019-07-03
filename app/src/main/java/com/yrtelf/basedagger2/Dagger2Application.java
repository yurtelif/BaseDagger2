package com.yrtelf.basedagger2;

import android.app.Application;

import com.yrtelf.basedagger2.injectors.AppComponent;
import com.yrtelf.basedagger2.injectors.AppModule;
import com.yrtelf.basedagger2.injectors.DaggerAppComponent;

public class Dagger2Application extends Application {

    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
