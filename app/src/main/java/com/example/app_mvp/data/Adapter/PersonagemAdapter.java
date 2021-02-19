package com.example.app_mvp.data.Adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_mvp.R;
import com.example.app_mvp.data.Api.DownloadImage;
import com.example.app_mvp.data.Mapper.Personagem;

import java.util.List;

public class PersonagemAdapter extends RecyclerView.Adapter<LinePersonagem> {

    List<Personagem> personagens;

    public PersonagemAdapter(List<Personagem> personagens){
        this.personagens = personagens;
    }

    @NonNull
    @Override
    public LinePersonagem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinePersonagem(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_personagens, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinePersonagem holder, int position) {
        Personagem personagem1 = personagens.get(position);
        holder.nomePersonagem1.setText(personagem1.getName());
        holder.especiePersonagem1.setText(personagem1.getSpecies());
        holder.casaPersonagem1.setText(personagem1.getHouse());
        holder.generoPersonagem1.setText(personagem1.getGender());
        if(personagem1.getDateOfBirth().isEmpty()){
            holder.dataPersonagem1.setText("Desconhecida");
        }else {
            holder.dataPersonagem1.setText(personagem1.getDateOfBirth());
        }
        new DownloadImage.DownloadImageTask(holder.imagemPersonagem1, holder.passView).execute(personagem1.getImage());
    }

    @Override
    public int getItemCount() {
        return personagens.size();
    }

    public void updateList(Personagem personagem) {
        insertItem(personagem);
    }

    private void insertItem(Personagem personagem) {
        personagens.add(personagem);
        notifyItemInserted(getItemCount());
    }
}
