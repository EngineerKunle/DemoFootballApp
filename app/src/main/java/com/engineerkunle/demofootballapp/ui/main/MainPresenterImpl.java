package com.engineerkunle.demofootballapp.ui.main;

import com.engineerkunle.demofootballapp.ui.base.BasePresenterImpl;

import javax.inject.Inject;

public class MainPresenterImpl<V extends MainView> extends BasePresenterImpl<V>
        implements MainPresenter<V> {

    private static final String TAG = "MainPresenterImpl";

    @Inject
    public MainPresenterImpl() {
        super();
    }

    @Override
    public void buttonPressed() {
    }

}
