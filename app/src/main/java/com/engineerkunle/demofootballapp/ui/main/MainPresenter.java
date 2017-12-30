package com.engineerkunle.demofootballapp.ui.main;

import com.engineerkunle.demofootballapp.injection.scopes.ActivityScope;
import com.engineerkunle.demofootballapp.ui.base.BasePresenter;

@ActivityScope
public interface MainPresenter <V extends  MainView> extends BasePresenter<V>{
    void buttonPressed(String text);
}
