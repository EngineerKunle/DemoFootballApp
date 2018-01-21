package com.engineerkunle.demofootballapp;

import android.app.Application;

import com.engineerkunle.demofootballapp.injection.components.AppComponent;
import com.engineerkunle.demofootballapp.injection.components.DaggerAppComponent;
import com.engineerkunle.demofootballapp.injection.modules.AppModule;

public class DemoFootballApp extends Application{

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build();
        appComponent.inject(this);

    }

    public static AppComponent getAppComponent() {return appComponent;}
}
