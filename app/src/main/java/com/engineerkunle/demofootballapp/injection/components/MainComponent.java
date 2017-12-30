package com.engineerkunle.demofootballapp.injection.components;

import com.engineerkunle.demofootballapp.injection.modules.MainActivityModule;
import com.engineerkunle.demofootballapp.injection.scopes.ActivityScope;
import com.engineerkunle.demofootballapp.ui.main.MainActivity;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = MainActivityModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
