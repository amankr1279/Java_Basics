package org.example.payment;

public class CreditCard implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment using credit card");
    }
}
