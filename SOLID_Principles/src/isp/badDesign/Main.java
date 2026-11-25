package isp.badDesign;

public class Main {
    public static void main(String[] args) {
        OfficeMachine machine = new MultiFactorPrinter();

        DocumentPrintService service = new DocumentPrintService(machine);

        service.printDocument("Invoice 123");
    }
}
