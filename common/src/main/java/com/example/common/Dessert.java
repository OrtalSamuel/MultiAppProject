package com.example.common;

public class Dessert {
    private String name;
    private String ingredients;
    private String instructions;
    private int imageResId;

    public Dessert(String name, String ingredients, String instructions, int imageResId) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getImageResId() {
        return imageResId;
    }
}