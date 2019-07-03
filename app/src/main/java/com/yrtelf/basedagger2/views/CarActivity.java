package com.yrtelf.basedagger2.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yrtelf.basedagger2.Dagger2Application;
import com.yrtelf.basedagger2.R;
import com.yrtelf.basedagger2.model.Car;

import javax.inject.Inject;

public class CarActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inject();

        car.start();
        car.stop();

    }

    private void inject(){
        Dagger2Application dagger2Application = (Dagger2Application) getApplication();
        dagger2Application.getAppComponent().inject(this);
    }

}
