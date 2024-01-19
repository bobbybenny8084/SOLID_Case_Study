package com.ilp.entity;

import com.ilp.interfaces.Payment;

public class CardPayment implements Payment {
    private int paymentId;
    private double totalAmount;
    private String cardNumber;

    public CardPayment(int paymentId, double totalAmount, String cardNumber) {
        this.setPaymentId(paymentId);
        this.totalAmount = totalAmount;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        // Card payment logic
        System.out.println("Processing card payment: $" + getTotalAmount() + " with card number: " + cardNumber);
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
}
