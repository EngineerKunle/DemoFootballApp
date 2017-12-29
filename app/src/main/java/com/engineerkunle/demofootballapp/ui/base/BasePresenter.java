package com.engineerkunle.demofootballapp.ui.base;

public interface BasePresenter<V extends BaseView> {
    void attach(V view);
    void detach();
}
