package de.neuefische.OrderSystem.model;

import java.util.ArrayList;

public class OrderDB {

    private static ArrayList<Order> orderList = new ArrayList<Order>();

    public void add(Order order){
        orderList.add(order);
    }

    public static ArrayList<Order> getOrderList() {
        return orderList;
    }


}
