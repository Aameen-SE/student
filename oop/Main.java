package oop;

class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(){}

    public BankAccount(String accountNumber,String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    //deposit
    public void deposit(double amount){
        if(amount>0){
            balance=+amount;
            System.out.println("Balance in account :"+balance);
        }else {
            System.out.println("Invalid deposit amount");
        }
    }

    // withdraw
    public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance=-amount;
            System.out.println("Amount withdrawn "+amount+"\n Balance in the amount : "+balance);
        }else
            System.out.println("Insufficient Balance or Invalid withdraw amount");
    }
    // checkBalance
    public void checkBalance(){
        System.out.println("Balance in the account : "+balance);
    }

    public String toString(){
        return "AccountNumber : "+accountNumber+"\n AccountHolderName : "+accountHolderName+"" +
                "\n Balance : "+balance;
    }



}

class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String accountNumber,String accountHolderName, double balance , double interestRate){
        super(accountNumber,accountHolderName,balance);
        this.interestRate=interestRate;
    }

    public void addInterest(){
        double interest = getBalance() * interestRate/100;
        deposit(interest);
        System.out.println("Interest added : "+interest);
    }
}

class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){

        if(amount <= getBalance() + overdraftLimit){
            double newBalance = getBalance() -amount;
            System.out.println("Amount withdrawn : "+amount+" Current Balance : "+newBalance);
        }
        else {
            System.out.println("Exceeded overdraftLimit");
        }

    }

}



public class Main {
    public static void main(String[] args) {
        BankAccount account1  = new BankAccount();
        account1.setAccountNumber("123");
        account1.setAccountHolderName("Aameen Hussain");
        account1.setBalance(45000);

        System.out.println(account1.toString());
    }
}
