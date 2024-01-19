package com.ilp.service;

import com.ilp.entity.Orders;
import com.ilp.interfaces.OrderManager;

import java.util.ArrayList;
import java.util.List;

public class ManageOrder implements OrderManager {
    private List<Orders> orders;

    public ManageOrder() {
        this.orders = new ArrayList<>();
    }

    @Override
    public void addOrder(Orders order) {
        orders.add(order);
    }

    @Override
    public void displayAllOrders() {
        System.out.println("All Orders:");
        for (Orders order : orders) {
            System.out.println("Order ID: " + order.getOrderId() +
                    ", Amount: $" + order.getOrderAmount() +
                    ", Payment Method: " + order.getPaymentMethod());
        }
    }
}
