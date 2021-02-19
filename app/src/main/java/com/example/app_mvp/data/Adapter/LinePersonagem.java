package com.example.app_mvp.data.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_mvp.R;

public class LinePersonagem extends RecyclerView.ViewHolder {

    TextView nomePersonagem1;
    TextView especiePersonagem1;
    TextView casaPersonagem1;
    TextView generoPersonagem1;
    TextView dataPersonagem1;
    ImageView imagemPersonagem1;
    View passView;
    public LinePersonagem(@NonNull View view) {

        super(view);
        passView = view;
        nomePersonagem1 = view.findViewById(R.id.personagemNome);
        especiePersonagem1 = view.findViewById(R.id.personagemEspecie);
        casaPersonagem1 = view.findViewById(R.id.personagemCasa);
        generoPersonagem1 = view.findViewById(R.id.personagemGenero);
        dataPersonagem1 = view.findViewById(R.id.personagemData);
        imagemPersonagem1 = view.findViewById(R.id.imageView);
    }


    /*nomePersonagem1.setText(personagem1.getName());
        holder.especiePersonagem1.setText(personagem1.getSpecies());
        holder.casaPersonagem1.setText(personagem1.getHouse());
        holder.generoPersonagem1.setText(personagem1.getGender());
        holder.dataPersonagem1.setText(personagem1.getDateOfBirth());

        if(position != personagens.size()){
            Personagem personagem2 = personagens.get(position+1);
            holder.nomePersonagem2.setText(personagem2.getName());
            holder.especiePersonagem2.setText(personagem2.getSpecies());
            holder.casaPersonagem2.setText(personagem2.getHouse());
            holder.generoPersonagem2.setText(personagem2.getGender());
            holder.dataPersonagem2.setText(personagem2.getDateOfBirth());
        }else{
            holder.nomePersonagem2.setVisibility(View.GONE);
            holder.especiePersonagem2.setVisibility(View.GONE);
            holder.casaPersonagem2.setVisibility(View.GONE);
            holder.generoPersonagem2.setVisibility(View.GONE);
            holder.dataPersonagem2.setVisibility(View.GONE);
        }*/
}
