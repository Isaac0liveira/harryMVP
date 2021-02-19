package com.example.app_mvp.data.Presenter;

import android.util.Log;

import com.example.app_mvp.data.Api.Api;
import com.example.app_mvp.data.Contrato.contratoPersonagens;
import com.example.app_mvp.data.Mapper.Personagem;
import com.example.app_mvp.data.UI.PersonagensActivity;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class presenterPersonagens implements contratoPersonagens.PersonagensPresenter {
    @Override
    public List<Personagem> getPersonagens(PersonagensActivity activity) {
        List<Personagem> personagens = new ArrayList<>();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.baseURL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        Api api = retrofit.create(Api.class);

        api.callPersonagem().enqueue(new Callback<List<Personagem>>() {
            @Override
            public void onResponse(Call<List<Personagem>> call, Response<List<Personagem>> response) {
                activity.mostrarLista(response.body());
            }

            @Override
            public void onFailure(Call<List<Personagem>> call, Throwable t) {
                activity.mostrarErro(t.getMessage());
            }
        });
        return personagens;
    }
}
