package com.example.a3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private ArrayList<String> carName;

    public CarAdapter(ArrayList<String> carName) {
        this.carName = carName;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car,parent ,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
    holder.bind(carName.get(position));
    }

    @Override
    public int getItemCount() {
        return carName.size();
    }
}
