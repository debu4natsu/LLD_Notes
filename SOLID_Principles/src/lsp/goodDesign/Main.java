package lsp.goodDesign;

public class Main {
    public static void main(String[] args) {

        WithdrawableAccount account = new SavingsAccount(1000);
        BillPaymentService billPaymentService = new BillPaymentService();
        billPaymentService.payBill(account,500);
    }
}
