package objct.comparable;
// Create a Product class with fields productId and productName. Sort products by product name alphabetically.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product>{
    private int productId;
    private String name;

    public Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductId :"+productId+" Name : "+name;
    }

    @Override
    public int compareTo(Product product) {
        return this.name.compareTo(product.name);
    }
}
public class ProductMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add( new Product(133,"Tomato"));
        products.add( new Product(145,"Milk"));
        products.add( new Product(125,"Rice"));


        Collections.sort(products);

        for (Product p : products){
            System.out.println(p);
        }
    }
}
