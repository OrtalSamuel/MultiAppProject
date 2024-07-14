package com.example.multiappproject;

import android.os.Bundle;

import com.example.common.MainActivityBase;

public class MainActivity extends MainActivityBase {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManagerDesserts();
        super.onCreate(savedInstanceState);

    }


}