package com.example.common;

import java.util.Map;

public class Manager {

    public Map<String, Dessert> desserts;


    public Manager(DataManagerBase dataManager) {
        desserts = dataManager.getDeserts();
    }
}
