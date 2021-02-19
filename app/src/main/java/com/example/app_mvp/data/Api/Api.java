package com.example.app_mvp.data.Api;

import com.example.app_mvp.data.Mapper.Personagem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {

    String baseURL = "http://hp-api.herokuapp.com/api/";

    @GET("characters")
    Call<List<Personagem>> callPersonagem();

}
