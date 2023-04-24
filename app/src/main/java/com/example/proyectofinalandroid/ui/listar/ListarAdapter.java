package com.example.proyectofinalandroid.ui.listar;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectofinalandroid.databinding.ItemNotaBinding;

import java.util.List;

public class ListarAdapter extends RecyclerView.Adapter<ListarAdapter.ViewHolder> {

    private List<String> listaDeNotas;
    private LayoutInflater inflater;

    public ListarAdapter(List<String> listaDeNotas, LayoutInflater inflater) {
        this.listaDeNotas = listaDeNotas;
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ListarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemNotaBinding binding = ItemNotaBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ListarAdapter.ViewHolder holder, int position) {
        holder.binding.tvNota.setText(listaDeNotas.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDeNotas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

    ItemNotaBinding binding;
        public ViewHolder(@NonNull ItemNotaBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
