package com.example.app_mvp.data.Contrato;

import com.example.app_mvp.data.Mapper.Personagem;
import com.example.app_mvp.data.UI.PersonagensActivity;

import java.util.List;

public interface contratoPersonagens {

    interface PersonagensView{

        void mostrarLista(List<Personagem> personagens);

        void mostrarErro(String message);

    }

    interface PersonagensPresenter{

        List<Personagem> getPersonagens(PersonagensActivity activity);

    }

}
