package dip.goodDesign;

public class SmsConfirmationSender implements OrderConformationSender{

    @Override
    public void sendConfirmation(Order order){
        System.out.println("Sending Sms to : " + order.getCustomerPhone());
    }
}
