package jva.may22;
//Create a class called BankAccount that represents a bank account.
//
//✅ Requirements:
//Attributes:
//
//accountNumber (String)
//
//accountHolderName (String)
//
//balance (double)
//
//Methods:
//
//deposit(amount) → adds money to the balance.
//
//withdraw(amount) → subtracts money if enough balance is available.
//
//displayBalance() → prints the current balance.
class BankAcc{
    private int amount;
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAcc( String accountNumber, String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit(int amount){
        if(amount>0){
            balance = amount+balance;
            System.out.println("Deposit : "+amount);
        } else
            System.out.println("Insufficient amount");

    }

    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("No sufficient balance ");
        } else{
            balance=balance-amount;
            System.out.println("Withdraw amount :"+amount);
        }
    }

    public void display(){
        System.out.println("AccountHolder Name :"+accountHolderName+"\nBalanace : "+balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        BankAcc bankAcc=new BankAcc("145623","Aameen",50000);

        bankAcc.display();
        bankAcc.deposit(5000);
        bankAcc.withdraw(45000);



    }
}
