package org.example.AnkitCode99.InterfaceSegregation.GoodDesign;

public class TelephoneOrders implements Order, Payment{
    @Override
    public void placeOrder() {
        // logic
    }

    @Override
    public void makePayment() {
        // logic
    }
}
