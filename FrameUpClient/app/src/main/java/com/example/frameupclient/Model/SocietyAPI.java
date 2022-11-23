package com.example.frameupclient.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface SocietyAPI {
    @GET("/society/get-all")
    Call<List<Society>> getAllSociety();

    @POST("/society/save")
    Call<Society> save(@Body Society society);
}