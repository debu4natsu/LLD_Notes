package ocp.goodDesign;

import java.math.BigDecimal;

public class UPIPayment implements PaymentMethod{
    @Override
    public void pay(BigDecimal amount){
        System.out.println("Processing UPI Payment: " + amount);
    }
}
