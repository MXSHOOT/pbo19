public class BankAccount {
    private double balance;
    private String accountName;
    public BankAccount(){
        balance=0;
        accountName="";
    }
    public BankAccount(String accountName){
        this.accountName = accountName;
    }
    public void getAll(){
        System.out.println("Account name : "+accountName);
        System.out.println("Balance : "+balance);
    }
    public void name(String name) {accountName = name;}
    public void deposit(double amount) {balance = balance + amount;}
    public void transfer(double amount, BankAccount dest){
        balance = balance - amount;
        dest.deposit(amount);
    }
}
