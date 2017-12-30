package com.engineerkunle.demofootballapp;

import android.app.Application;

import com.engineerkunle.demofootballapp.injection.components.AppComponent;
import com.engineerkunle.demofootballapp.injection.components.DaggerAppComponent;

public class DemoFootballApp extends Application{

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().build();
        appComponent.inject(this);

    }

    public static AppComponent getAppComponent() {return appComponent;}
}
