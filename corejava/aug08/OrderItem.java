package corejava.aug08;

public class OrderItem {
    //Create a class OrderItems having member variables orderId, productId, quantity. create getters and
    //		setters for all member variables. Create object of OrderItems class in other class inside main method and set all member values and print
    //		all member values using getters.

    private int orderId;
    private int productId;
    private int quantity;

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
