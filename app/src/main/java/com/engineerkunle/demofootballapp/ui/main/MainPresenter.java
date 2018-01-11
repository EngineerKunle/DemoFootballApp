package com.engineerkunle.demofootballapp.ui.main;

import com.engineerkunle.demofootballapp.injection.scopes.FragmentScope;
import com.engineerkunle.demofootballapp.ui.base.BasePresenter;

@FragmentScope
public interface MainPresenter <V extends  MainView> extends BasePresenter<V>{
    void buttonPressed(String text);
    void callApi();
}
