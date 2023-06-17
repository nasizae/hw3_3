package com.example.a3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CarFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<String>carName=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.rv_car);
        loadData();
        CarAdapter carAdapter=new CarAdapter(carName);
        recyclerView.setAdapter(carAdapter);
    }
    private void loadData() {
    carName.add("Mersedes");
    carName.add("Honda");
    carName.add("toyota");
    carName.add("mazda");
    carName.add("audi");
    carName.add("BMW");
    carName.add("Prius");
    carName.add("Chevrolet");
    carName.add("volvo");
    carName.add("daf");
    }
}