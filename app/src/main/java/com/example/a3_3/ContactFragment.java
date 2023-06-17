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

public class ContactFragment extends Fragment {
private Button btn_car;
private ArrayList<String> contactList=new ArrayList<>();
private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.rv_contact);
        loadData();
        ContactAdapter contactAdapter=new ContactAdapter(contactList);
        recyclerView.setAdapter(contactAdapter);
        btn_car=requireActivity().findViewById(R.id.car);
        btn_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragments,new CarFragment()).commit();
            }
        });

    }
    private void loadData(){
        contactList.add("+996 555 947239");
        contactList.add("+996 555 762878");
        contactList.add("+996 555 378326");
        contactList.add("+996 555 327862");
        contactList.add("+996 555 327844");
        contactList.add("+996 555 213412");
        contactList.add("+996 555 534561");
        contactList.add("+996 555 346345");
        contactList.add("+996 555 352342");
        contactList.add("+996 555 523522");
        contactList.add("+996 555 625233");
        contactList.add("+996 555 235232");
    }
}