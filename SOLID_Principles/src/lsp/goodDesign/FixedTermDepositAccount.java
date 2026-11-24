package lsp.goodDesign;

public class FixedTermDepositAccount implements BankAccount{
    private double balance;

    @Override
    public double getBalance(){
        return balance;
    }

    @Override
    public void deposit(double amount){
        if(amount<=0 || amount>balance){
            throw new IllegalArgumentException("Invalid Withdrawal Amount");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful: " + amount);
    }


}
