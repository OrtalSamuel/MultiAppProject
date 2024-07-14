package com.example.deliciousmilkshakesrecipes;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.common.MainActivityBase;

public class MainActivity extends MainActivityBase {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataManagerBase = new DataManagerMilkshakes();
        super.onCreate(savedInstanceState);

    }}