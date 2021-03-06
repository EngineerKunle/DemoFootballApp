package com.engineerkunle.demofootballapp.injection.modules;

import android.app.Activity;
import android.content.Context;

import com.engineerkunle.demofootballapp.injection.scopes.ActivityScope;
import com.engineerkunle.demofootballapp.ui.splash.SplashPresenter;
import com.engineerkunle.demofootballapp.ui.splash.SplashPresenterImpl;
import com.engineerkunle.demofootballapp.ui.splash.SplashView;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    Context provideContext() {
        return activity;
    }

    @Provides
    @ActivityScope
    SplashPresenter<SplashView> providesSplashPresenter(SplashPresenterImpl<SplashView> presenter){
        return presenter;
    }
}
