package com.engineerkunle.demofootballapp.ui.main;

import com.engineerkunle.demofootballapp.BuildConfig;
import com.engineerkunle.demofootballapp.api.ApiCallHelperImpl;
import com.engineerkunle.demofootballapp.api.model.DemoApiResponse;
import com.engineerkunle.demofootballapp.ui.base.BasePresenterImpl;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainPresenterImpl<V extends MainView> extends BasePresenterImpl<V>
        implements MainPresenter<V> {

    private static final String TAG = "MainPresenterImpl";

    private ApiCallHelperImpl getApi;

    @Inject
    public MainPresenterImpl(ApiCallHelperImpl getApi) {
        super();
        this.getApi = getApi;
    }

    @Override
    public void attach(V view) {
        super.attach(view);
    }

    @Override
    public void detach() {
        super.detach();
    }

    @Override
    public void buttonPressed(String text) {
        getView().showToast(text);
    }

    @Override
    public void callApi() {
        getApi.requestPlayersStats(BuildConfig.API_KEY, BuildConfig.SHEET)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DemoApiResponse>() {
                    @Override
                    public void accept(DemoApiResponse response) throws Exception {
                        getView().setUpList(response.getRecords());
                    }
                });
    }

}
