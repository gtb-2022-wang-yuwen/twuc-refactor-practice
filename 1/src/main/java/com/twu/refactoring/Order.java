package com.twu.refactoring;

import java.util.List;

public class Order {
    String customerName;
    String customerAddress;
    List<LineItem> items;

    public Order(String customerName, String customerAddress, List<LineItem> items) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<LineItem> getLineItems() {
        return items;
    }
}
