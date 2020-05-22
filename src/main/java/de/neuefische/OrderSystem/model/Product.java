package de.neuefische.OrderSystem.model;

public class Product {

    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product: " +
                "ID: " + id +
                " / Productname: " + name ;
    }
}
