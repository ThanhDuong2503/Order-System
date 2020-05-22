package de.neuefische.OrderSystem.model;

import java.util.ArrayList;

public class OrderService {

    private OrderDB orderDB = new OrderDB();
    private ProductDB productDB = new ProductDB();
    private ArrayList<Product> productslist = new ArrayList<Product>();

    public OrderService(ProductDB productDB) {
        this.productDB = productDB;

    }
    public void createOrder(){
        productslist.add(productDB.getProductList().get(0));
        productslist.add(productDB.getProductList().get(2));
        Order order = new Order(1, productslist);
        add(order);
    }

    public void add(Order order){
        orderDB.add(order);
    }

    public void printAllOrder() {
        System.out.print(orderDB.getOrderList().toString());

    }





}
