package de.neuefische.OrderSystem.model;

import java.util.ArrayList;
import java.util.Objects;

public class ProductDB {

    private final ArrayList<Product> productList = new ArrayList<Product>();

    public void add(Product product) {
        productList.add(product);
    }

    public ArrayList<Product> getProducts() {
        return productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDB productDB = (ProductDB) o;
        return Objects.equals(productList, productDB.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }
}
