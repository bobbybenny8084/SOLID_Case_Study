package com.ilp.service;
import com.ilp.entity.Orders;
import com.ilp.interfaces.OrderManager;
import com.ilp.interfaces.Payment;

public class PaymentProcessor {
    private OrderManager orderManager;

    public PaymentProcessor(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    public double calculateTax(double totalAmount) {
        return totalAmount * 0.1;  // Assuming 10% product tax
    }

    public double calculateShipping(double totalAmount) {
        return 4.0;  // Assuming a flat $5.0 shipping charge
    }

    public void processPayment(Payment payment) {
        // Your existing payment processing logic

        // Example: Print payment details
        System.out.println("Processing payment with ID: " + payment.getTotalAmount());

        // Add additional processing specific to the payment type if needed
        payment.processPayment();

        // Add the order after payment
        Orders order = new Orders(0, payment.getTotalAmount(), null);
        orderManager.addOrder(order);
    }
}
