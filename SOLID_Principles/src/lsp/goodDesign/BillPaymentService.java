package lsp.goodDesign;

import lsp.badDesign.Account;

public class BillPaymentService {
    public void payBill(WithdrawableAccount account, double amount){
        account.withdraw(amount);
        System.out.println("Bill Payment Successful");
    }
}
