package dailypractice.nov.nov21;
//Create an interface Payable with method pay().
//
//Create two classes CreditCard and UPI implementing it.**

interface Payable{
    void pay();
}
class CreditCard implements Payable{

    @Override
    public void pay() {
        System.out.println("Payment using CreditCard");
    }
}
class UPI implements Payable{

    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}
public class InterfaceProg {
    public static void main(String[] args) {
//        CreditCard creditCard =new CreditCard();
//        creditCard.pay();
//        UPI upi = new UPI();
//        upi.pay();

        Payable p1= new CreditCard();
        Payable p2= new UPI();
        p1.pay();
        p2.pay();

    }
}
