package dailypractice.july23;

import java.util.ArrayList;
import java.util.List;

class Book{
    private int id;
    private String name;
    private int price;

    public Book(){}

    public Book(int id, String name,int price){
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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id : "+id +"Name : "+name +" Price :"+price;
    }
}
 class BookService {

   List<Book> books = new ArrayList<>();



    //addbook
     public void  addBook(Book b){
        books.add(b);
         System.out.println("Book added sucessfully");
     }

     // view all book
     public void getAllBook(){
         books.forEach(e-> System.out.println(e));
     }
 }
public class BookManagementSystem {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        bookService.addBook(new Book(12312,"Power",562));
        bookService.addBook(new Book(1231,"King",362));
        bookService.addBook(new Book(1223,"Subconcious",162));
        bookService.getAllBook();

    }
}
