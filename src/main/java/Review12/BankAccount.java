package Review12;

public class BankAccount {
    double balance;

    BankAccount (double balance){
        this.balance=balance;
    }
    void  withdraw(double amountToWithdraw){
        if(amountToWithdraw > balance){
            throw new InsufficientBalance("Not possible insufficient balance");//you will throw exception of ur class
        }
        balance=balance-amountToWithdraw;
    }
}
class BankTester{
    public static void main(String[] args) {

        BankAccount ba=new BankAccount(100);
        ba.withdraw(400);

    }
}