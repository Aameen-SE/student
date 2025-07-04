package objct.comparable;
//Create a Book class with fields title and price. Implement Comparable to sort books by price in descending order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>{
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title : "+title+" , Price : "+price;
    }


    @Override
    public int compareTo(Book o) {
        return o.price-this.price;
    }
}
public class BookMain {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Power",240));
        books.add(new Book("Power of Subconcious Mind",150));
        books.add(new Book("Think Positive ",450));

        Collections.sort(books);

        for(Book b: books){
            System.out.println(b);
        }
    }
}
