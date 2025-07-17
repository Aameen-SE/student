package dailypractice.july17;
//Create a Bank Account Creation System using the Factory Design Pattern.
//
//The system should be able to create different types of bank accounts:
//
//SavingsAccount
//
//CurrentAccount
//
//FixedDepositAccount
//
//Each account type should implement a method accountType() that prints:
//
//"Savings Account Created"
//
//"Current Account Created"
//
//"Fixed Deposit Account Created"

interface Create {
    void create();
}

class SavingAccount implements Create{

    @Override
    public void create() {
        System.out.println("Saving accounts created !!");
    }
}

class CurrentAccount implements Create{

    @Override
    public void create() {
        System.out.println("Current account created ");
    }
}

class FixedDepositAccount implements Create{

    @Override
    public void create() {
        System.out.println("Fixed Deposit Account is created !!!");
    }
}

class AccountCreateFactory {
    public Create createType(String type){

        if(type==null){
            return null;
        }
        switch (type){
            case "Saving Account":
                return new SavingAccount();
            case "Current Account":
                return new CurrentAccount();
            case "Fixed DepositAccount":
                return new FixedDepositAccount();
            default:
                return null;
        }
    }


}
public class BankAccountCreationMain {

    public static void main(String[] args) {

        AccountCreateFactory acFactory = new AccountCreateFactory();
       Create accountCreate1 = acFactory.createType("Saving Account");
       accountCreate1.create();
    }
}
