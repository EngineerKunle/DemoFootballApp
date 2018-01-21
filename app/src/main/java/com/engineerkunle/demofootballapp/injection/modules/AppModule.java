package com.engineerkunle.demofootballapp.injection.modules;

import android.content.Context;
import android.support.annotation.NonNull;

import com.engineerkunle.demofootballapp.DemoFootballApp;
import com.engineerkunle.demofootballapp.api.ApiCallHelperImpl;
import com.engineerkunle.demofootballapp.injection.scopes.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final DemoFootballApp demoFootballApp;

    public AppModule(@NonNull DemoFootballApp demoFootballApp) {
        this.demoFootballApp = demoFootballApp;
    }

    @AppScope
    @Provides
    Context provideContext() {
        return demoFootballApp;
    }

    @AppScope
    @Provides
    ApiCallHelperImpl provideApi() {return new ApiCallHelperImpl();}
}
