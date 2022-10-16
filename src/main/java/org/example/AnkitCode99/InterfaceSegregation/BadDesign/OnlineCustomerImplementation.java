package org.example.AnkitCode99.InterfaceSegregation.BadDesign;

public class OnlineCustomerImplementation implements RestaurantInterface{
    @Override
    public void acceptOnlineOrder() {
        // logic
    }

    @Override
    public void acceptTelephoneOrder() {
        // useless
    }

    @Override
    public void acceptWalkInOrder() {
        // useless
    }

    @Override
    public void onlinePayment() {
        // logic
    }

    @Override
    public void inPersonPayment() {
        // useless
    }
}
