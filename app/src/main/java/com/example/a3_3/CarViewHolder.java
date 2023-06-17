package com.example.a3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCarName;
    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCarName=itemView.findViewById(R.id.tv_carName);
    }

    public void bind(String car){
        tvCarName.setText(car);
    }
}
