package corejava.sep18;

import java.util.Date;

public class InventoryItem {
              private int invItem;                  //Create a class InventaoryItem with member variables UUID, int invItem,
              private String title;                  // String title, double price,  and memeber methods
              private double price;                  //		are getters,  and setters, override toString()

    public InventoryItem(int invItem, String title, double price){
        this.invItem=invItem;
        this.title=title;
        this.price=price;
    }

    public int getInvItem() {
        return invItem;
    }

    public void setInvItem(int invItem) {
        this.invItem = invItem;
    }

    public String getTitle() {
        return title;
    }

    public void setTittle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




     public String toString(){
        return String.format("invItem - %d, title - %s , price - %f ", invItem, title, price);
    }

}
