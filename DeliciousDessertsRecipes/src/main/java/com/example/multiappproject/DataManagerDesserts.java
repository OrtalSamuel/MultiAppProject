package com.example.multiappproject;

import com.example.common.DataManagerBase;
import com.example.common.Dessert;

import java.util.HashMap;
import java.util.Map;

public class DataManagerDesserts extends DataManagerBase {

    @Override
    public Map<String, Dessert> getDeserts() {

         Map<String, Dessert> desserts = new HashMap<>();

            desserts.put("Pancakes", new Dessert("Pancakes",
                    "1 cup all-purpose flour\n2 tablespoons sugar\n1 tablespoon baking powder\n1/2 teaspoon salt\n1 cup milk\n1 egg\n2 tablespoons melted butter\n1 teaspoon vanilla extract",
                    "1. In a bowl, mix flour, sugar, baking powder, and salt.\n" +
                            "2. In another bowl, whisk milk, egg, melted butter, and vanilla.\n" +
                            "3. Combine the wet and dry ingredients until smooth.\n" +
                            "4. Heat a lightly oiled griddle over medium heat.\n" +
                            "5. Pour batter onto the griddle and cook until bubbles form, then flip and cook until golden brown.\n" +
                            "6. Serve with syrup and enjoy!",
                    R.drawable.ic_pancakes));

            desserts.put("Chocolate Balls", new Dessert("Chocolate Balls",
                    "200g crushed biscuits\n100g melted butter\n200g sweetened condensed milk\n50g cocoa powder\n100g shredded coconut (optional)",
                    "1. In a bowl, mix crushed biscuits, cocoa powder, and melted butter.\n" +
                            "2. Add condensed milk and mix until combined.\n" +
                            "3. Roll the mixture into small balls.\n" +
                            "4. Roll the balls in shredded coconut if desired.\n" +
                            "5. Refrigerate for at least 1 hour before serving.",
                    R.drawable.ic_chocolate));

            desserts.put("Cheesecake", new Dessert("Cheesecake",
                    "200g digestive biscuits, crushed\n100g melted butter\n400g cream cheese\n100g sugar\n1 teaspoon vanilla extract\n2 eggs\n200ml sour cream",
                    "1. Mix crushed biscuits with melted butter and press into the bottom of a baking dish.\n" +
                            "2. Beat cream cheese, sugar, and vanilla until smooth.\n" +
                            "3. Add eggs one at a time, beating after each addition.\n" +
                            "4. Pour mixture over the crust and bake at 160°C for 45 minutes.\n" +
                            "5. Let it cool and refrigerate for at least 4 hours before serving.",
                    R.drawable.ic_cheesecake));

        return desserts;
    }




}
