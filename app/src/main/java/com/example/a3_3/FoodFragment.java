package com.example.a3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.ArrayList;

public class FoodFragment extends Fragment {
    private Button btn_contact;
    private RecyclerView recyclerView;
    private ArrayList<String> FoodList=new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        InitView();
        InitListener();
        recyclerView=view.findViewById(R.id.rv_food);
        loadData();
        FoodAdapter foodAdapter=new FoodAdapter(FoodList);
        recyclerView.setAdapter(foodAdapter);
    }
    private void InitView() {
            btn_contact=requireActivity().findViewById(R.id.btn_contact);

    }
    private void InitListener() {
        btn_contact.setOnClickListener(view -> {
           requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragments,new ContactFragment()).addToBackStack(null).commit();
        });
    }

    private void loadData() {
        FoodList.add("Чили");
        FoodList.add("пеперони");
        FoodList.add("лазы джи");
        FoodList.add("дапанджи");
        FoodList.add("щи");
        FoodList.add("Лагман");
        FoodList.add("плов");
        FoodList.add("беш бармак");
        FoodList.add("оливье");
        FoodList.add("жидкий лагман");
        FoodList.add("курдак");
        FoodList.add("жаровня");
        FoodList.add("манты");
    }
}