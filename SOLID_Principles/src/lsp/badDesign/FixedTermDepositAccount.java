package lsp.badDesign;

public class FixedTermDepositAccount extends Account{

    public FixedTermDepositAccount(double balance){
        super(balance);
    }

    @Override
    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid Deposit Amount");
        }
        balance += amount;
        System.out.println("Deposit Successful: " + amount);
    }

    @Override
    public void withdraw(double amount){
        throw new UnsupportedOperationException("Withdrawal is not allowed before maturity");
    }
}
