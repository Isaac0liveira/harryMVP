package com.example.app_mvp.data.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.app_mvp.R;
import com.example.app_mvp.data.Adapter.PersonagemAdapter;
import com.example.app_mvp.data.Contrato.contratoPersonagens;
import com.example.app_mvp.data.Mapper.Personagem;
import com.example.app_mvp.data.Presenter.presenterPersonagens;

import java.util.ArrayList;
import java.util.List;

public class PersonagensActivity extends AppCompatActivity implements contratoPersonagens.PersonagensView {

    RecyclerView listaPersonagens;
    presenterPersonagens presenter;
    PersonagemAdapter adapter;
    List<Personagem> personagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);
        init();
    }

    public void init(){
        listaPersonagens = findViewById(R.id.listaPersonagens);
        presenter = new presenterPersonagens();
        setAdapter();
    }

    @Override
    public void mostrarLista(List<Personagem> personagens) {
        this.personagens.addAll(personagens);
        listaPersonagens.setLayoutManager(new GridLayoutManager(this, 2));
        listaPersonagens.setAdapter(adapter);
    }

    @Override
    public void mostrarErro(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void setAdapter(){
        adapter = new PersonagemAdapter(personagens);
        presenter.getPersonagens(this);
    }
}