package lsp.badDesign;

public class Main {
    public static void main(String[] args) {
        Account account = new FixedTermDepositAccount(1000);

        BillPaymentService billPaymentService = new BillPaymentService();
        billPaymentService.payBill(account,500);
    }
}
