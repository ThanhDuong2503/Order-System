package de.neuefische.OrderSystem.model;

import java.util.ArrayList;

public class Order {

    private int id;
    private ArrayList<Product> products;

    public Order(int id, ArrayList<Product> products) {
        this.id = id;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order: " +
                "ID: " + id +
                " / Product: " + products;
    }
}
