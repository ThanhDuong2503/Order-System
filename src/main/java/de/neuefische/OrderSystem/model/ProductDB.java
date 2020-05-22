package de.neuefische.OrderSystem.model;

import java.util.ArrayList;
import java.util.Objects;

public class ProductDB {

    private final ArrayList<Product> productList = new ArrayList<Product>();

    public void add(Product product) {
        productList.add(product);
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }


}
