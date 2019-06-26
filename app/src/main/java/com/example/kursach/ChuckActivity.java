package com.example.kursach;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kursach.data.Entities.Root;


public class ChuckActivity extends AppCompatActivity {

    private TextView text;
    private Root root;
    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuck);
        text.findViewById(R.id.tv);



        model = ViewModelProviders.of(this).get(Model.class);
        //model = ViewModelProviders.of(this).get(Model.class)
        model.loadData();

        root = model.getJoke();
        text.setText(root.getValue().getJoke());
    }
}
