package com.ilp.utility;
import com.ilp.entity.CardPayment;
import com.ilp.entity.UpiPayment;
import com.ilp.service.ManageOrder;
import com.ilp.service.PaymentProcessor;

public class PaymentUtility {

    public static void main(String[] args) {
        double amount = 10;

        ManageOrder manageOrder = new ManageOrder();
        PaymentProcessor calculateTotalAmount = new PaymentProcessor(manageOrder);
        double tax = calculateTotalAmount.calculateTax(amount);
        double shippingAmount = calculateTotalAmount.calculateShipping(amount);
        double totalAmount = tax + shippingAmount + amount;

        // Example: UPI payment
        UpiPayment upiPayment = new UpiPayment(1, totalAmount, "user@bank");
        calculateTotalAmount.processPayment(upiPayment);

        // Example: Card payment
        CardPayment cardPayment = new CardPayment(2, totalAmount, "1234-5678-9012-3456");
        calculateTotalAmount.processPayment(cardPayment);

        // Display all orders
        manageOrder.displayAllOrders();
    }
}
