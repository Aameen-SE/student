package jva.oop;
//Product Inventory
//Product: productId, name, quantity
//
//Operations: Add product, Remove product, Update quantity, View all

import java.util.ArrayList;
import java.util.Iterator;

class Product{
    private int productId;
    private String name;
    private Long quantity;

    public Product(int productId, String name, Long quantity){
        this.productId=productId;
        this.name=name;
        this.quantity=quantity;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void display(){
        System.out.println("ProductId : "+productId);
        System.out.println("Name : "+name);
        System.out.println("Quantity : "+quantity);
        System.out.println("============================");

    }
}

class ProductService{
    private ArrayList<Product> productArrayList = new ArrayList<>();

    // Add product
    public void adProduct(int productId, String name, Long quantity ){
        productArrayList.add(new Product(productId,name,quantity));
        System.out.println("Added Successfully ");
        System.out.println("=============================");
    }

    // view all list
    public void viewList(){
        for(Product p:productArrayList){
            p.display();
        }
    }

    //Remove product

    public void deleteProduct(int id){
        boolean found =false;
        Iterator<Product> productIterator= productArrayList.iterator();
        while (productIterator.hasNext()){
            Product p=productIterator.next();
            if(p.getProductId()==id){
                productIterator.remove();
                found=true;
                System.out.println("Product removed successfully\n");
                break;
            }
        }
        if(!found)
            System.out.println("No prodduct found with id :"+id);
    }

    //Update quantity
    public void updateQuantity(int id , Long quantity){
        boolean found = false;
       for(Product p:productArrayList){
           if(p.getProductId()==id){
               p.setQuantity(quantity);
               found=true;
               System.out.println("Product Updated Succesfully \n");
               break;
           }
       }

       if(!found)
           System.out.println("No such product found with that id :"+id);
        }
    }


public class ProductInventory {
    public static void main(String[] args) {
         ProductService productService = new ProductService();
         productService.adProduct(12,"Milk",12l);
        productService.adProduct(13,"Perfume",120l);
        productService.adProduct(14,"Waterbottle",102l);
     //    productService.viewList();
        productService.deleteProduct(13);
      //  productService.viewList();
        productService.updateQuantity(12,15l);
        productService.viewList();
    }
}
