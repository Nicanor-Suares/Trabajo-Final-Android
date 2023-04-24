package com.example.proyectofinalandroid.ui.listar;

import static com.example.proyectofinalandroid.NavigationActivity.listaNotas;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class ListarViewModel extends ViewModel {

    private MutableLiveData<List<String>> listaNotasLiveData = new MutableLiveData<List<String>>();

    public ListarViewModel() {
        listaNotasLiveData.setValue(listaNotas);
    }

    public MutableLiveData<List<String>> getListaDeNotasLiveData() {
        if (listaNotasLiveData == null) {
            listaNotasLiveData = new MutableLiveData<>();
            listaNotasLiveData.setValue(listaNotas);
        }
        return listaNotasLiveData;
    }

}