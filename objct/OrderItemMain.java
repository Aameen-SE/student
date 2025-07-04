package objct;
//Create a class OrderItem with member variables UUID, int orderItem, int quantity and memeber methods are getters,
// and setters, override
//		toString(), hashcode() and equals() methods.

import java.util.Objects;
import java.util.UUID;

class OrderItem{
    private String uuid;
    private int orderItem;
    private int quantity;

    public OrderItem(int orderItem, int quantity) {
        this.orderItem = orderItem;
        this.uuid = UUID.randomUUID().toString();
        this.quantity = quantity;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(int orderItem) {
        this.orderItem = orderItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "UUID : "+uuid+" OrderItem : "+orderItem+" Quantity : "+quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null) return false;
        if(this.getClass()!=obj.getClass())return false;

        OrderItem other = (OrderItem) obj;
        return this.orderItem==other.orderItem&& this.quantity==other.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, orderItem, quantity);
    }
}
public class OrderItemMain {
    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem(142,23);
        OrderItem orderItem2 = new OrderItem(121,23);

        //tostringmethod
        System.out.println(orderItem1.toString());
        System.out.println(orderItem2.toString());

        //equalmethod
        System.out.println(orderItem1.equals(orderItem2));

        //hashcode
        System.out.println(orderItem1.hashCode());
        System.out.println(orderItem2.hashCode());
    }
}
