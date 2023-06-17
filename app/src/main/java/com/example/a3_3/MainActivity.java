package com.example.a3_3;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFragments(new FoodFragment());
        addFragments(new ContactFragment());
        addFragments(new CarFragment());
    }

    private void addFragments(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().add(R.id.fragments,fragment).commit();


    }


}