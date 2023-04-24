package com.example.proyectofinalandroid.ui.cargar;

import static com.example.proyectofinalandroid.NavigationActivity.listaNotas;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.proyectofinalandroid.Alerts;

public class CargarViewModel extends ViewModel {

    public MutableLiveData<String> error = new MutableLiveData<>();

    public CargarViewModel() {
    }

    public void guardarNota(String nota) {
        listaNotas.add(nota);
    }

}