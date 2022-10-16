package org.example.AnkitCode99.InterfaceSegregation.BadDesign;

public interface RestaurantInterface {
    void acceptOnlineOrder();

    void acceptTelephoneOrder();

    void acceptWalkInOrder();

    void onlinePayment();

    void inPersonPayment();
}
