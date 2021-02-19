package com.example.app_mvp.data.Adapter;

import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_mvp.R;
import com.example.app_mvp.data.Mapper.Personagem;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PersonagemAdapter extends RecyclerView.Adapter<LinePersonagem> {

    List<Personagem> personagens;

    public PersonagemAdapter(List<Personagem> personagens) {
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
        if (personagem1.getDateOfBirth().isEmpty()) {
            holder.dataPersonagem1.setText("Desconhecida");
        } else {
            String data = personagem1.getDateOfBirth().replaceAll("-", "/");
            String[] s = data.split("/");
            String novaData = s[0]+"/"+s[1]+"/"+s[2];
            holder.dataPersonagem1.setText(novaData);
        }
        if (((BitmapDrawable) holder.imagemPersonagem1.getDrawable()) == null) {
            Picasso.get().load(personagem1.getImage()).resize(100, 140).into(holder.imagemPersonagem1);
            holder.imagemPersonagem1.setTag(holder);
        }
        if(personagem1.getHouse().equals("Sonserina")){
            holder.constraintCard.setBackgroundResource(R.drawable.shape_sonserina);
        }else if(personagem1.getHouse().equals("Grifinória")){
            holder.constraintCard.setBackgroundResource(R.drawable.shape_grifinoria);
        }else if(personagem1.getHouse().equals("Corvinal")){
            holder.constraintCard.setBackgroundResource(R.drawable.shape_corvinal);
        }else{
            holder.constraintCard.setBackgroundResource(R.drawable.shape_random);
        }
    }

    @Override
    public int getItemCount() {
        return personagens.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
