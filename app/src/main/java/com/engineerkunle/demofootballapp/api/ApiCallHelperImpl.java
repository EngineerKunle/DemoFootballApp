package com.engineerkunle.demofootballapp.api;


import com.engineerkunle.demofootballapp.BuildConfig;
import com.engineerkunle.demofootballapp.api.model.DemoApiResponse;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public final class ApiCallHelperImpl implements ApiCallHelper {
    private Retrofit retrofit;

    public ApiCallHelperImpl() {
    }

    @Override
    public Observable<DemoApiResponse> requestPlayersStats(String id, String sheet) {
        final ApiCall call = apiCall();
        return call.requestRecords(id, sheet);
    }

    private ApiCall apiCall() {
        retrofit = new Retrofit.Builder().baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        return retrofit.create(ApiCall.class);
    }
}
