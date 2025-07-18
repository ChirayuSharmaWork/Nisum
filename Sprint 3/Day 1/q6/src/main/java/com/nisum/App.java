package com.nisum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PaymentService service = new PaymentService();

        service.processPaymentMethod("cash", "DISCOUNT10");
        service.processPaymentMethod("card", "FAKEOFFER");
        service.processPaymentMethod("upi", "DISCOUNT10");
    }
}
