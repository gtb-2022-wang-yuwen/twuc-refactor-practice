package com.twu.refactoring;

public class OrderItem {
	private String desc;
	private double p;
	private int qty;

	public OrderItem(String desc, double p, int qty) {
		super();
		this.desc = desc;
		this.p = p;
		this.qty = qty;
	}

	public String getDescription() {
		return desc;
	}

	public double getPrice() {
		return p;
	}

	public int getQuantity() {
		return qty;
	}

    double totalAmount() {
        return p * qty;
    }
}