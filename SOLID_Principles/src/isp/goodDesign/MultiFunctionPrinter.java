package isp.goodDesign;

public class MultiFunctionPrinter implements Printable, Scannable, Faxable{

    @Override
    public void print(String docuemnt){
        System.out.println("Printing: " + docuemnt);
    }

    @Override
    public void scan(){
        System.out.println("Scanning Complete");
    }

    @Override
    public void fax(String document){
        System.out.println("Faxing: " + document);
    }
}
