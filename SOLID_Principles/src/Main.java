//import srp.badDesign.InvoiceManager;
//
//public class Main {
//    public static void main(String[] args) {
//        InvoiceManager invoiceManager = new InvoiceManager();
//        double total = invoiceManager.calculateTotal(100);
//
//        System.out.print("Total: " + total);
//
//        invoiceManager.saveInvoice(total);
//        invoiceManager.sendInvoiceEmail(total, "debu@gmail.com");
//
//        }
//    }
import srp.badDesign.InvoiceManager;
import srp.goodDesign.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        InvoiceService invoiceService = new InvoiceService(new InvoiceCalculator(),new InvoiceRepository(),new InvoiceEmailSender());

        invoiceService.issueInvoice(new Invoice(new BigDecimal("100"), "adi@gmail.com"));
    }
}
