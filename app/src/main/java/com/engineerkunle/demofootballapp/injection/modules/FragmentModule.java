package com.engineerkunle.demofootballapp.injection.modules;


import android.app.Activity;

import com.engineerkunle.demofootballapp.injection.scopes.FragmentScope;
import com.engineerkunle.demofootballapp.ui.main.MainPresenter;
import com.engineerkunle.demofootballapp.ui.main.MainPresenterImpl;
import com.engineerkunle.demofootballapp.ui.main.MainView;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {

    private final Activity activity;

    public FragmentModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @FragmentScope
    MainPresenter<MainView> providesMainPresenter(MainPresenterImpl<MainView> presenter) {
        return presenter;
    }
}
