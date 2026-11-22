package ocp.badDesign;

public class PaymentProcessor {
    public void processPayment(String paymentType, double amount){
        if(paymentType.equals("CREDIT_CARD")) {
            System.out.println("Processing Credit Card Payment");
        }
        else if(paymentType.equals("UPI")) {
            System.out.println("Processing UPI Payment");
        }
        else if (paymentType.equals("WALLET")) {
            System.out.println("Processing Wallet Payment");
        }
    }
}
