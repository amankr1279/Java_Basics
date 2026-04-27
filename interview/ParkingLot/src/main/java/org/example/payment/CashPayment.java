package org.example.payment;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Cash payment");
    }
}
