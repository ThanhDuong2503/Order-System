package de.neuefische.OrderSystem.model;

import java.util.ArrayList;
import java.util.Objects;

public class OrderService {

    private final OrderDB orderDB = new OrderDB();
    private final ProductDB productDB;
    public OrderService(ProductDB productDB) {
        this.productDB = productDB;
    }

    public void createOrder(){
        ArrayList<Product> productslist = new ArrayList<Product>();
        if(productslist.contains(productDB.getProducts())){
        productslist.add(productDB.getProducts().get(0));
        productslist.add(productDB.getProducts().get(1));
        Order order = new Order(1, productslist);
        add(order);}
        else {
            throw new RuntimeException("Product does not exist!");
        }
    }

    public void add(Order order){
        orderDB.add(order);
    }

    public void printAllOrder() {
        System.out.println(orderDB.getOrderList().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderService that = (OrderService) o;
        return Objects.equals(orderDB, that.orderDB) &&
                Objects.equals(productDB, that.productDB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDB, productDB);
    }
}
