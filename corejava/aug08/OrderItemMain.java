package corejava.aug08;

public class OrderItemMain {
    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem();

        orderItem.setOrderId(256);
        orderItem.setProductId(452);
        orderItem.setQuantity(20);

        System.out.println("Order ID :"+orderItem.getOrderId()+" ; ProductId :"+orderItem.getProductId()+" ;" +
                " Quantity :"+orderItem.getQuantity());
    }
}
