package lsp.goodDesign;

public class SavingsAccount implements WithdrawableAccount{

    private double balance;

    public SavingsAccount(double balance){
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount){
        if(amount<=0 || amount>balance){
            throw new IllegalArgumentException("Invalid Withdrawal Amount");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful: " + amount);
    }

    @Override
    public double getBalance(){
        return balance;
    }
    @Override
    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid Deposit Amount");
        }

        balance += amount;
        System.out.println("Deposit Successful: " + amount);
    }
}
