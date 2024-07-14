package com.example.common;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {


   private Manager gameManager;
  private DataManagerBase dataManagerBase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        String dessertName = getIntent().getStringExtra("DESSERT_NAME");
        String managerClassName = getIntent().getStringExtra("MANAGER_CLASS");

        try {
            // Use reflection to create an instance of DataManagerBase
            Class<?> clazz = Class.forName(managerClassName);
            dataManagerBase = (DataManagerBase) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        gameManager = new Manager(dataManagerBase);
        Dessert dessert = gameManager.desserts.get(dessertName);


        if (dessert != null) {
            ImageView dessertImage = findViewById(R.id.recipe_image);
            TextView recipeTitle = findViewById(R.id.recipe_title);
            TextView ingredientsList = findViewById(R.id.ingredients_list);
            TextView instructionsList = findViewById(R.id.instructions_list);

            dessertImage.setImageResource(dessert.getImageResId());
            recipeTitle.setText(dessert.getName());
            ingredientsList.setText(dessert.getIngredients());
            instructionsList.setText(dessert.getInstructions());
        }
    }


}