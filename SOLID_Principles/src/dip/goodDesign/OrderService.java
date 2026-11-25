package dip.goodDesign;

public class OrderService {
    private final OrderConformationSender conformationSender;

    public OrderService(OrderConformationSender conformationSender){
        this.conformationSender = conformationSender;
    }

    public void placeOrder(Order order){
        System.out.println("Order placed: " + order.getOrderId());
        conformationSender.sendConfirmation(order);
    }
}
