package com.example.kursach;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.kursach.data.Entities.Root;
import com.example.kursach.data.NetworkUtils;

import java.util.List;

public class Model extends ViewModel {

    Root root;
    private NetworkUtils networkUtils;

    public void loadData() {
        if(root == null) {
            // TODO
            root = networkUtils.getJoke();
        }
    }

    public Root getJoke() {
        return root;
    }

}
