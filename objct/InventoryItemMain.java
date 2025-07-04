package objct;

//Create a class InventaoryItem with member variables UUID, int invItem, String title, double price,
// Date purchaseDate and member methods
//		are getters,  and setters, override toString(), hashcode() and equals() methods.

import java.util.Objects;
import java.util.UUID;

class  InventoryItem{
    private String uuid;
    private String title;
    private int invItem;
    private double price;

    public InventoryItem(String title, int invItem, double price) {
        this.uuid= UUID.randomUUID().toString();
        this.title = title;
        this.invItem = invItem;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getInvItem() {
        return invItem;
    }

    public void setInvItem(int invItem) {
        this.invItem = invItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "Title : "+title+" InvItem : "+invItem+" Price : "+price+" UUID : "+uuid;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;

        if(obj==null) return false;

        if(getClass()!=obj.getClass()) return false;

        InventoryItem other = (InventoryItem) obj;

        return this.title == other.getTitle() && this.invItem==other.getInvItem()&&this.price== other.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, invItem, price);
    }

}
public class InventoryItemMain {
    public static void main(String[] args) {

        InventoryItem item1 = new InventoryItem("Cadbury",12,100.0);
        InventoryItem item2 = new InventoryItem("Cadbury",12,100.0);
        InventoryItem item3 = new InventoryItem("Kitkat",12,100.0);

        // overridden to string method

        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());

        //overriden equalMethod

        System.out.println(item1.equals(item2));
        System.out.println(item2.equals(item3));

        //hashcode method
        System.out.println(item1.hashCode());
        System.out.println(item2.hashCode());
        System.out.println(item3.hashCode());
    }
}
