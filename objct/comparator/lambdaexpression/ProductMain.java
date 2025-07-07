package objct.comparator.lambdaexpression;

//Create a Product class with fields name and price.
//👉 Sort products by price ascending using lambda expression.

import java.util.ArrayList;
import java.util.List;

class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name : "+name+" Price :"+price;
    }
}
public class ProductMain {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk",456.0));
        products.add(new Product("Biscuit",256.0));
        products.add(new Product("DryFruit",156.0));
        products.add(new Product("Potato",356.0));

        products.sort((e1,e2)->Double.compare(e1.getPrice(), e2.getPrice()));

        for (Product p:products){
            System.out.println(p);
        }
    }
}
