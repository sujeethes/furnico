package com.example.furnico.retrofit.network;
import com.example.furnico.retrofit.model.Customer;
import com.example.furnico.retrofit.model.ResponseString;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface IPostApi {
    @Headers("Content-Type: application/json")
    @POST("loginCustomer")
    Call<ResponseString> loginPost(@Body Customer customer);

    @Headers("Content-Type: application/json")
    @POST("registerCustomer")
    Call<ResponseString> registerPost(@Body Customer customer);

}
