package objct.comparable;

//Create a Laptop class with fields brand and price. Sort laptops by price ascending, and if prices are equal, sort by brand name.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements   Comparable<Laptop>{
    private String brand;
    private int price;

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand : "+brand+" Price : "+price;
    }


    @Override
    public int compareTo(Laptop laptop) {
        int priceCompare = Integer.compare(this.price,laptop.price);
        if(priceCompare==0){
            return this.brand.compareTo(laptop.brand);
        }
        return priceCompare;
    }
}
public class LaptopMain {

    public static void main(String[] args) {

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("HP",45000));
        laptops.add(new Laptop("Lenovo",35000));
        laptops.add(new Laptop("Dell",45000));

        Collections.sort(laptops);
        for (Laptop l :laptops){
            System.out.println(l);
        }
    }
}
