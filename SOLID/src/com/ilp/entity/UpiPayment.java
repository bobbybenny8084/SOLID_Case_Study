package com.ilp.entity;

import com.ilp.interfaces.Payment;

public class UpiPayment implements Payment {
    private int paymentId;
    private double totalAmount;
    private String upiId;

    public UpiPayment(int paymentId, double totalAmount, String upiId) {
        this.paymentId = paymentId;
        this.totalAmount = totalAmount;
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        // UPI payment logic
        System.out.println("Processing UPI payment: $" + getTotalAmount() + " with UPI ID: " + upiId);
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }
}
