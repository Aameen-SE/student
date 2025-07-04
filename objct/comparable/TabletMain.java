package objct.comparable;
//Create a Tablet class with fields brand, price, and releaseYear. Sort by release year descending, then by price ascending.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tablet implements Comparable<Tablet>{
    private String brand ;
    private int price;
    private int year;

    public Tablet(String brand, int price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "brand='" + brand +", price=" + price + ", year=" + year ;
    }

    @Override
    public int compareTo(Tablet o) {
        int sortYear = o.year-this.year;
        if(sortYear==0){
            return this.price-o.price;
        }
        return sortYear;
    }
}
public class TabletMain {

    public static void main(String[] args) {
        List<Tablet> tablets = new ArrayList<>();
        tablets.add(new Tablet("Micromax",400,2022));
        tablets.add(new Tablet("Samasung",500,2024));
        tablets.add(new Tablet("Iphone",1000,2024));
        tablets.add(new Tablet("Lenovo",500,2023));

        Collections.sort(tablets);

        for (Tablet t:tablets){
            System.out.println(t);
        }
    }
}
