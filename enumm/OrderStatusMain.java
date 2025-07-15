package enumm;

//Create an enum called OrderStatus with values: PLACED, SHIPPED, DELIVERED, and CANCELLED.
//Write a method called getStatusMessage(OrderStatus status) that returns:
//"Your order has been placed." for PLACED
//"Your order is on the way!" for SHIPPED
//"Your order has been delivered." for DELIVERED
//"Your order was cancelled." for CANCELLED
//Use a switch statement inside this method.

enum OrderStatus{
    PLACED, SHIPPED, DELIVERED,  CANCELLED;
}
public class OrderStatusMain {

    public static  void getStatusMessage(OrderStatus status){

        switch (status){
            case PLACED : System.out.println("Your order has been placed.");
            break;

            case SHIPPED : System.out.println("Your order has been placed.");
                break;

            case DELIVERED : System.out.println("Your order has been placed.");
                break;

            case CANCELLED : System.out.println("Your order has been placed.");
                break;
        }

    }
    public static void main(String[] args) {

        OrderStatus s = OrderStatus.SHIPPED;
        getStatusMessage(s);
    }
}
