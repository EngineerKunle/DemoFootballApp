package com.engineerkunle.demofootballapp.injection.modules;

import android.content.Context;
import android.support.annotation.NonNull;

import com.engineerkunle.demofootballapp.injection.scopes.AppScope;

public class AppModule {

    private Context appContext;

    public AppModule(@NonNull Context appContext) {
        this.appContext = appContext;
    }

    @AppScope
    Context provideContext() {
        return appContext;
    }
}
