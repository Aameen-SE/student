package jva.oop;
//Bank Account Manager
//Account: accNo, name, balance
//
//Operations: Add account, Delete, Update balance, View all

import java.util.ArrayList;
import java.util.Iterator;

class BankAccount{
    private int accNo;
    private String name;
    private int balance;


    public BankAccount(int accNo, String name, int balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void display(){
        System.out.println("Account No : "+accNo);
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
        System.out.println("==========================");
    }
}

class BankAccountService{
    private ArrayList<BankAccount> bankAccount=new ArrayList<>();

    //Add account
    public void addAccount(int acNo,String name, int balance){
        bankAccount.add(new BankAccount(acNo,name,balance));
        System.out.println("Added Sucessfully");
    }

    // view all
    public void viewAll(){
        for(BankAccount b: bankAccount){
            b.display();
        }
    }

    // delete an account
    public void deleteAccount(int acNo){
        boolean found=false;
        Iterator<BankAccount> bankAccountIterator=bankAccount.iterator();
        while (bankAccountIterator.hasNext()){
            BankAccount b=bankAccountIterator.next();
            if(b.getAccNo()==acNo){
                bankAccountIterator.remove();
                found=true;
                System.out.println("Account deleted succesfully ");
                break;
            }
        }
        if(!found)
            System.out.println("No such account exist with acNo :"+acNo);
    }

    public void updateAcc(int acNo, int bal){
        boolean found = false;
        for(BankAccount ba:bankAccount){
        if(ba.getAccNo()==acNo){
            ba.setBalance(bal);
            found=true;
            System.out.println("Updated Succesfully ");
            break;
        }
        }
        if (!found)
            System.out.println("No such account exist with acNo :"+acNo);
    }
}
public class BankAccountManager {
    public static void main(String[] args) {
        BankAccountService bankAccountService=new BankAccountService();

        bankAccountService.addAccount(1254556569,"Aameen",75000);
        bankAccountService.addAccount(13551215,"Amin",85000);
        bankAccountService.addAccount(1242456,"Arsalan",65000);
        bankAccountService.addAccount(2122365,"Rahul",50000);
        System.out.println("----------------");
        bankAccountService.viewAll();
        bankAccountService.deleteAccount(2122365);
        bankAccountService.updateAcc(1254556569,90000);
        bankAccountService.viewAll();

    }
}
