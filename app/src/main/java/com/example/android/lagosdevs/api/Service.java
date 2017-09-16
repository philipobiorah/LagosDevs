package com.example.android.lagosdevs.api;

import com.example.android.lagosdevs.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by USER on 9/16/2017.
 */
public interface Service {

    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();



}


