package com.example.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivityBase extends AppCompatActivity {

    protected DataManagerBase dataManagerBase;

    private ImageView image1;
    private TextView recipe1;
    private ImageView image2;
    private TextView recipe2;
    private ImageView image3;
    private TextView recipe3;

    private Manager gameManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        gameManager = new Manager(dataManagerBase);
        loadItems();

    }

    private void loadItems() {
        List<String> dessertNames = new ArrayList<>(gameManager.desserts.keySet());

        if (dessertNames.size() > 0) {
            String firstDessertName = dessertNames.get(0);
            Dessert firstDessert = gameManager.desserts.get(firstDessertName);
            if (firstDessert != null) {
                Glide.with(this).load(firstDessert.getImageResId()).into(image1);
                recipe1.setTag(firstDessert.getName());
            }
        }

        if (dessertNames.size() > 1) {
            String secondDessertName = dessertNames.get(1);
            Dessert secondDessert = gameManager.desserts.get(secondDessertName);
            if (secondDessert != null) {
                Glide.with(this).load(secondDessert.getImageResId()).into(image2);
                recipe2.setTag(secondDessert.getName());
            }
        }

        if (dessertNames.size() > 2) {
            String thirdDessertName = dessertNames.get(2);
            Dessert thirdDessert = gameManager.desserts.get(thirdDessertName);
            if (thirdDessert != null) {
                Glide.with(this).load(thirdDessert.getImageResId()).into(image3);
                recipe3.setTag(thirdDessert.getName());
            }
        }
    }

    private void findViews() {
        image1 = findViewById(R.id.image1);
        recipe1 = findViewById(R.id.recipe1);
        image2 = findViewById(R.id.image2);
        recipe2 = findViewById(R.id.recipe2);
        image3 = findViewById(R.id.image3);
        recipe3 = findViewById(R.id.recipe3);

    }

    public void openRecipe(View view) {
        String dessertName = (String) view.getTag();
        Intent intent = new Intent(this, RecipeActivity.class);
        intent.putExtra("DESSERT_NAME", dessertName);
        intent.putExtra("MANAGER_CLASS", dataManagerBase.getClass().getName()); // Pass the class name
        startActivity(intent);
    }

}