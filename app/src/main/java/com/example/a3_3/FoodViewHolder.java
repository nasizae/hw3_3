package com.example.a3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.logging.Handler;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFoodName;
    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFoodName=itemView.findViewById(R.id.tv_foodName);
    }
public void Bind(String foodName){
        tvFoodName.setText(foodName);
}
}
