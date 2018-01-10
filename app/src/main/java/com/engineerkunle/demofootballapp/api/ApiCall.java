package com.engineerkunle.demofootballapp.api;


import com.engineerkunle.demofootballapp.api.model.DemoApiResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiCall {
    @GET("exec")
    Observable<DemoApiResponse> requestRecords(@Query("id") String id, @Query("sheet") String sheet);
}
