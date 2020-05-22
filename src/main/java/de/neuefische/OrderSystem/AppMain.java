package de.neuefische.OrderSystem;

import de.neuefische.OrderSystem.model.*;

import java.sql.SQLOutput;

public class AppMain {
    public static void main(String[] args){

        ProductDB productDB = new ProductDB();
        productDB.add(new Product(1, "Hamburger"));
        productDB.add(new Product(2, "Cheeseburger"));
        productDB.add(new Product(3, "BigMac"));
        productDB.add(new Product(4, "Chickenburger"));

        System.out.println(productDB.getProducts());

        System.out.println("------------------------------------------------------------------------------");

        OrderService orderService = new OrderService(productDB);
        try{
            orderService.createOrder();
            orderService.printAllOrder();
        }
        catch (RuntimeException e) {
            System.out.println(e);
        }

    }
}
