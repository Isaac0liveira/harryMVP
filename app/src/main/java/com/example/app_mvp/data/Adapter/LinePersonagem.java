package com.example.app_mvp.data.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_mvp.R;

public class LinePersonagem extends RecyclerView.ViewHolder {

    TextView nomePersonagem1;
    TextView especiePersonagem1;
    TextView casaPersonagem1;
    TextView generoPersonagem1;
    TextView dataPersonagem1;
    ImageView imagemPersonagem1;
    ConstraintLayout constraintCard;
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
        constraintCard = view.findViewById(R.id.constraintCard);
    }

}
