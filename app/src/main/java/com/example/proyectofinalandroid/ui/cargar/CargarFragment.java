package com.example.proyectofinalandroid.ui.cargar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.proyectofinalandroid.Alerts;
import com.example.proyectofinalandroid.R;
import com.example.proyectofinalandroid.databinding.FragmentCargarBinding;


public class CargarFragment extends Fragment {

    private FragmentCargarBinding binding;
    private CargarViewModel vm;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CargarViewModel cargarViewModel =
                new ViewModelProvider(this).get(CargarViewModel.class);

        binding = FragmentCargarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        vm = new ViewModelProvider(requireActivity()).get(CargarViewModel.class);

        EditText etNota = binding.etNuevaNota;
        Button btnGuardar = binding.btnGuardar;

        btnGuardar.setOnClickListener(view -> {
            if(!etNota.getText().toString().isEmpty()){
                vm.guardarNota(etNota.getText().toString());
                etNota.setText("");
                Alerts.showSuccessDialog(getContext());
                Navigation.findNavController(view).navigate(R.id.nav_listar);
            } else {
                Alerts.showErrorDialog(getContext());
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}