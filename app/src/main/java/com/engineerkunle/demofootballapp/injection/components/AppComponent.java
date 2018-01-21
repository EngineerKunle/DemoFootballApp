package com.engineerkunle.demofootballapp.injection.components;

import com.engineerkunle.demofootballapp.DemoFootballApp;
import com.engineerkunle.demofootballapp.injection.modules.ActivityModule;
import com.engineerkunle.demofootballapp.injection.modules.AppModule;
import com.engineerkunle.demofootballapp.injection.modules.FragmentModule;
import com.engineerkunle.demofootballapp.injection.scopes.AppScope;

import dagger.Component;

@AppScope
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DemoFootballApp app);
    MainComponent plus(ActivityModule module);
    FragmentComponent plus (FragmentModule module);
}
