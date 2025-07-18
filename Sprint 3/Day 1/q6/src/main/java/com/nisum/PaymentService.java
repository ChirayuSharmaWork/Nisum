package com.nisum;

public class PaymentService {

    public void paymentMethod(String paymentType, String offer) throws PaymentException {

        if (!"card".equalsIgnoreCase(paymentType) && !"upi".equalsIgnoreCase(paymentType)) {
            throw new InvalidPaymentMethodException("Unsupported payment type " + paymentType);
        }

        if (offer != null && !"DISCOUNT10".equalsIgnoreCase(offer)) {
            throw new InvalidOfferAppliedException("Invalid Offer Applied " + offer);
        }

    }

    public void processPaymentMethod(String paymentType, String offer) {
        try {
            paymentMethod(paymentType, offer);
        } catch (PaymentException e) {
            switch (e) {
                case InvalidPaymentMethodException ex ->
                        System.out.println("Payment failed: Invalid payment method - " + ex.getMessage());

                case InvalidOfferAppliedException ex ->
                        System.out.println("Payment failed: Invalid offer - " + ex.getMessage());

                default -> System.out.println("Unknown payment error: " + e.getMessage());
            }

        }

    }

}

