package jva.may22;

import java.util.Scanner;

// Requirements:
//Create an interface PaymentMethod with:
//
//Method: void pay(double amount)
//
//Implement the interface in three classes:
//
//CreditCardPayment
//
//PayPalPayment
//
//UPIPayment
//
//Each class should have its own pay() implementation with a print statement like:
//
//"Paid ₹5000 using Credit Card."
//
//In the main program:
//
//Use polymorphism to call pay() for each method.
//
//Let the user choose payment type (optional: use a switch or random selection).
interface PaymentMethod {
   abstract void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Paid amount : "+amount +" using Credit Card");
    }
}

class PayPalPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Paid amount : "+amount +" using PayPal Payment");
    }
}

class UPIPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid amount : "+amount +" using UPI Payment");

    }
}
public class PaymentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be paid : ");
        double amount = sc.nextDouble();

        System.out.println("Choose the payment method \n 1. Credit Card \n 2. Paypal Payment \n 3. UPI Payment : ");
        int choice = sc.nextInt();

        PaymentMethod payment ;
        switch (choice){
            case 1 :
                payment = new CreditCardPayment();
                break;
            case 2:
                payment=new PayPalPayment();
                break;
            case 3:
                payment=new UPIPayment();
                break;

            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        payment.pay(amount);
        sc.close();

    }

}
