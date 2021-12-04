package com.example.lv1;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {

    static ApiManager instance;
    private CourseApiService service;

    private ApiManager(){
        Retrofit.Builder builder = new Retrofit.Builder();

        Retrofit retrofit = builder.baseUrl("https://catalog-api.udacity.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(CourseApiService.class);
    }
    public static ApiManager getInstance(){
        if (instance == null){
            instance = new ApiManager();
        }
        return instance;
    }
    public CourseApiService service(){
        return service;
    }
}