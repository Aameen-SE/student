package jva.oop.june30;
//Order and Customer classes
//
//Order class with orderId, date, and a Customer object.
//
//Customer class with name, email.
//
//Implement toString() to print order summary.

import java.time.LocalDate;

class Order{
    private  int orderId;
    private LocalDate date;
    private Customer customer;

    public Order(int orderId, LocalDate date, Customer customer) {
        this.orderId = orderId;
        this.date = date;
        this.customer = customer;
    }

    public String toString(){
        return "OrderId : "+orderId+"\n"+customer+"\nDate : "+date;
    }
}
class Customer{
    private String name;
    private String email;

    public Customer(String name , String email){
        this.name=name;
        this.email=email;
    }

    public String toString(){
        return "Name :"+name+"\nEmail :"+email;
    }
}
public class OrderMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Order order = new Order(124,date,new Customer("Aameen","aameen@gmail.com"));
        System.out.println(order.toString());
    }
}
