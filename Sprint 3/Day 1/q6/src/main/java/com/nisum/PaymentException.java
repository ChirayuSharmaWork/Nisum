package com.nisum;

public sealed class PaymentException extends Exception
        permits InvalidOfferAppliedException, InvalidPaymentMethodException {

    public PaymentException(String message) {
        super(message);
    }
}

final class InvalidPaymentMethodException extends PaymentException{
    public InvalidPaymentMethodException(String message) {
        super(message);
    }
}
final class InvalidOfferAppliedException extends PaymentException{
    public InvalidOfferAppliedException(String message) {
        super(message);
    }
}
