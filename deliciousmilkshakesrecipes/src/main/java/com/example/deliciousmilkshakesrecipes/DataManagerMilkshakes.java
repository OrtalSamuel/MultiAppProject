package com.example.deliciousmilkshakesrecipes;

import com.example.common.DataManagerBase;
import com.example.common.Dessert;

import java.util.HashMap;
import java.util.Map;

public class DataManagerMilkshakes extends DataManagerBase {
    public Map<String, Dessert> getDeserts() {

        Map<String, Dessert> desserts = new HashMap<>();


        desserts.put("Vanilla Milkshake", new Dessert("Vanilla Milkshake",
                "2 cups vanilla ice cream\n1 cup milk\n1 teaspoon vanilla extract",
                "1. Combine vanilla ice cream, milk, and vanilla extract in a blender.\n" +
                        "2. Blend until smooth.\n" +
                        "3. Pour into a glass and serve immediately.",
                R.drawable.ic_vanila));

        desserts.put("Chocolate Milkshake", new Dessert("Chocolate Milkshake",
                "2 cups chocolate ice cream\n1 cup milk\n2 tablespoons chocolate syrup",
                "1. Combine chocolate ice cream, milk, and chocolate syrup in a blender.\n" +
                        "2. Blend until smooth.\n" +
                        "3. Pour into a glass and serve immediately.",
                R.drawable.ic_chooclate));

        desserts.put("Strawberry Milkshake", new Dessert("Strawberry Milkshake",
                "2 cups strawberry ice cream\n1 cup milk\n1/2 cup fresh strawberries, hulled",
                "1. Combine strawberry ice cream, milk, and fresh strawberries in a blender.\n" +
                        "2. Blend until smooth.\n" +
                        "3. Pour into a glass and serve immediately.",
                R.drawable.ic_strawberry));

        return desserts;


    }
}
