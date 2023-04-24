package com.example.proyectofinalandroid;

import android.content.Context;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Alerts {

    public static void showExitDialog(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Salir")
                .setMessage("¿Desea cerrar la aplicación?")
                .setPositiveButton("Si", (dialog, which) -> ((AppCompatActivity) context).finishAndRemoveTask())
                .setNegativeButton("No", (dialog, which) -> dialog.dismiss())
                .show();
    }

    public static void showErrorDialog(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Error")
                .setMessage("La nota no puede ser vacia")
                .setPositiveButton("Okay", (dialog, which) -> dialog.dismiss())
                .show();
    }

    public static void showSuccessDialog(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Exito")
                .setMessage("Nota agregada con exito")
                .setPositiveButton("Okay", (dialog, which) -> dialog.dismiss())
                .show();
    }
}
