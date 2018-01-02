package com.engineerkunle.demofootballapp.ui.splash;

import com.engineerkunle.demofootballapp.ui.base.BasePresenterImpl;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;

public class SplashPresenterImpl<V extends SplashView> extends BasePresenterImpl<V>
    implements SplashPresenter<V> {

    private Disposable disposable;
    private static final int TIME_DELAY = 2000;

    @Inject
    public SplashPresenterImpl() {
        super();
    }

    @Override
    public void attach(V view) {
        super.attach(view);

        disposable = Observable.timer(TIME_DELAY, TimeUnit.MILLISECONDS, Schedulers.io())
                .doOnComplete(new Action() {
                    @Override
                    public void run() throws Exception {
                        getView().showMainActivity();
                    }
                }).subscribe();
    }

    @Override
    public void detach() {
        disposable.dispose();
        super.detach();
    }
}
