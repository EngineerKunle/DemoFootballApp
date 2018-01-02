package com.engineerkunle.demofootballapp.injection.components;

import com.engineerkunle.demofootballapp.injection.modules.ActivityModule;
import com.engineerkunle.demofootballapp.injection.scopes.ActivityScope;
import com.engineerkunle.demofootballapp.ui.main.MainActivity;
import com.engineerkunle.demofootballapp.ui.splash.SplashActivity;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
    void inject(SplashActivity splashActivity);
}
