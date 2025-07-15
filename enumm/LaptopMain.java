package enumm;
enum Laptop{

    Macbook,Windows(25000),ThinkPad(14500);

    Laptop(){
        price =500;
    }

    private int price;

    Laptop(int price){
        this.price=price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
public class LaptopMain {

    public static void main(String[] args) {

        for(Laptop l : Laptop.values()){
            System.out.println(l+" = "+l.getPrice());
        }

    }
}
