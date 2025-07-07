package objct.comparator;

// Create a Product class with fields productId and rating. Write a comparator to sort products by rating descending.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product{
    private int productId;
    private int rating;

    public Product(int productId, int rating) {
        this.productId = productId;
        this.rating = rating;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ProductId : "+productId+" Rating : "+rating;
    }
}

class RatingComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getRating()-o1.getRating();
    }
}
public class ProductMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(142,5));
        products.add(new Product(132,2));
        products.add(new Product(102,4));
        products.add(new Product(112,0));

        Collections.sort(products,new RatingComparator());

        for (Product p : products){
            System.out.println(p);
        }
    }
}
