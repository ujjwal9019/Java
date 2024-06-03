package Enums;


// An enum (short for "enumeration") in Java is a special data type that allows a variable to be a set of predefined constants. It is used to represent a fixed set of related constants, such as the days of the week, the months of the year, or the states in a finite state machine.

public class Enum {
     public enum PaymentMethod {
        CREDIT_CARD, DEBIT_CARD, PAYPAL, CASH
    }
    public static void main(String[] args) {
        PaymentMethod payment = PaymentMethod.PAYPAL;

        switch (payment) {
            case CREDIT_CARD:
                System.out.println("Payment made with credit card.");
                break;
            case DEBIT_CARD:
                System.out.println("Payment made with debit card.");
                break;
            case PAYPAL:
                System.out.println("Payment made with PayPal.");
                break;
            case CASH:
                System.out.println("Payment made with cash.");
                break;
        }
    }
}
