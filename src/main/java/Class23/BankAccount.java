package Class23;

public class BankAccount {
   private String userName;
    private String passWord;

    double accountBalance=1200;

    public BankAccount(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;

    }
   public double getAccountBalance(String passWord){
        if(passWord.equals(this.passWord)){
            return accountBalance;
        }else {
            return 0;
        }
    }
}
class BankTester{
    public static void main(String[] args) {
    BankAccount ba= new BankAccount("admin", "abc");
        System.out.println(ba.getAccountBalance("passWord"));
    }
}