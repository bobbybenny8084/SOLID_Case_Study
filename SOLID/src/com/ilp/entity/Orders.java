package com.ilp.entity;
public class Orders {
	private int orderId;
    private double orderAmount;
    private String paymentMethod;
	public Orders(int orderId, double orderAmount, String paymentMethod) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.paymentMethod = paymentMethod;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}   
}
