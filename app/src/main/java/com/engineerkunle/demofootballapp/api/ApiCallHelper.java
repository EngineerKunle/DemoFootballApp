package com.engineerkunle.demofootballapp.api;


import com.engineerkunle.demofootballapp.api.model.DemoApiResponse;

import io.reactivex.Observable;

public interface ApiCallHelper {
    Observable<DemoApiResponse> requestPlayersStats(String id, String sheet);
}
