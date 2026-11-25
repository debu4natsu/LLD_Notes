package dip.goodDesign;

public class EmailConformationSender implements OrderConformationSender{

    @Override
    public void sendConfirmation(Order order){
        System.out.println("Sending email to : " + order.getCustomerEmail());
    }
}
