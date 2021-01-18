package com.example.furnico.retrofit.networkmanager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilderUserService {
    private static Retrofit instance;

    private RetrofitBuilderUserService(){}
    public static Retrofit getInstance(){
        if(instance==null){
            synchronized (RetrofitBuilderUserService.class){
                if(instance==null){
                    instance = new Retrofit.Builder().baseUrl("http://10.177.68.56:8085/user/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(new OkHttpClient()).build();
                }
            }
        }
        return instance;
    }
}
