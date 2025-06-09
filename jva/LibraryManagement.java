package jva;

import java.util.ArrayList;
import java.util.Iterator;

class Library {

    //2. Library Management
    //Book: id, title, author
    //
    //Operations: Add book, Delete by id, Update title, View all books

    private int id;
    private String title;
    private String author;

    public Library(int id, String author, String title){
        this.id=id;
        this.author=author;
        this.title=title;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void display(){
        System.out.println("Id : "+id);
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("------------------------");

    }
}

class LibraryService{
    ArrayList<Library> libraries = new ArrayList<>();

    //Add book
    public void addBook(int id, String author, String title){
        libraries.add(new Library(id,author,title));
        System.out.println("Book added succesfully ");
    }

    // view all Book
    public void viewAllBook(){
        for (Library lib: libraries){
            lib.display();
        }
    }


    //Delete by id

    public void deleteById(int id){
        boolean found = false;
        Iterator<Library> libraryIterator= libraries.iterator();
        while (libraryIterator.hasNext()){
            Library lib = libraryIterator.next();
            if(lib.getId()==id){
                libraryIterator.remove();
                found=true;
                System.out.println("Book is removed ");
                break;
            }
        }

        if(!found)
            System.out.println("No Such book id : "+id+" is in library ");
    }

    // Update title
    public void updateTitle(int id, String title ){
        boolean found = false;
        for(Library lib: libraries){
            if(lib.getId()==id){
                lib.setTitle(title);
                found=true;
                System.out.println("Updated Successfully ");
                break;
            }
        }
        if(!found)
            System.out.println("No such book with that id :"+id+"is in the library ");
    }

}
public class LibraryManagement {
    public static void main(String[] args) {
        LibraryService libraryService= new LibraryService();
        libraryService.addBook(12,"Amin Faraz","Physic ");
        libraryService.addBook(13,"Arsalan Khan","Chemistry ");
        libraryService.addBook(14,"Asif khan","Maths ");
    libraryService.viewAllBook();
    libraryService.deleteById(12);
    libraryService.viewAllBook();
libraryService.updateTitle(14,"Concise Maths");

libraryService.viewAllBook();

    }
}
