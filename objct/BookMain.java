package objct;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Book{
    private int id ;
    private String name ;
    private int price ;

    public Book(int id , String name , int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Id : "+id+" Name : "+name +" Price : "+price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null) return false;
        if(this.getClass()!=obj.getClass())return false;

        Book other = (Book) obj;

        return  this.name.equals(other.name)&&this.price==other.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,price);
    }
}
public class BookMain {

    public static void main(String[] args) {

        Map<Book, String> bookMap = new HashMap<>();

        Book book1 = new Book(145,"The Power",145);
        Book book2 = new Book(125,"The Mind",125);
        Book book3 = new Book(135,"Everyday Struggle",155);
        Book book4 = new Book(145,"The Power",145);

        //



        bookMap.put(book1,"Shelf 1");
        bookMap.put(book2,"Shelf 3");
        bookMap.put(book3,"Shelf 2");

        // as the id  name and price is same
        System.out.println("Book4 : "+bookMap.get(book4));
        System.out.println(bookMap.get(book2));
        book2.setId(666);

        System.out.println("After changing  id : "+bookMap.get(book2));

        for(Map.Entry<Book,String> b : bookMap.entrySet()){
            System.out.println(b.getKey()+" = "+b.getValue());
        }

        //equal method
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book4));

    }
}
