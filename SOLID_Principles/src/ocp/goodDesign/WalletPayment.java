package ocp.goodDesign;

import java.math.BigDecimal;

public class WalletPayment implements PaymentMethod{
    @Override
    public void pay(BigDecimal amount){
        System.out.println("Processing Wallet Payment: " + amount);
    }
}
