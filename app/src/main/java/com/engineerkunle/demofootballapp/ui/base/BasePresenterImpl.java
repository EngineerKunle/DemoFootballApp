package com.engineerkunle.demofootballapp.ui.base;

public class BasePresenterImpl <V extends BaseView> implements BasePresenter<V> {

    private V view;

    public BasePresenterImpl(V view) {
        this.view = view;
    }

    @Override
    public void attach(V view) {
        this.view = view;
    }

    @Override
    public void detach() {
        view = null;
    }

    public V getView() {
        return view;
    }
}
