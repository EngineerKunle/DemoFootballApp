package com.engineerkunle.demofootballapp.injection.modules;

import android.app.Activity;
import android.content.Context;

import com.engineerkunle.demofootballapp.injection.scopes.ActivityScope;
import com.engineerkunle.demofootballapp.ui.main.MainPresenter;
import com.engineerkunle.demofootballapp.ui.main.MainPresenterImpl;
import com.engineerkunle.demofootballapp.ui.main.MainView;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    private final Activity activity;

    public MainActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    Context provideContext() {
        return activity;
    }

    @Provides
    @ActivityScope
    MainPresenter<MainView> providesMainPresenter(MainPresenterImpl<MainView> presenter) {
        return presenter;
    }
}
