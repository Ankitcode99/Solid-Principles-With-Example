package org.example.AnkitCode99.InterfaceSegregation.GoodDesign;

public class OnlineOrders implements Order, Payment{
    @Override
    public void placeOrder() {
        // logic
    }

    @Override
    public void makePayment() {
        // logic
    }
}
