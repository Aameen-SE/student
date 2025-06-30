package jva.oop.june30;
//Movie and Director classes
//
//Movie class with title, genre, and Director object.
//
//Director class with name and country.
//
//Print full movie info.
class Movie{
    private String title;
    private String genre;
    private  Director director;

    public Movie(String title , String genre, Director director){
        this.title=title;
        this.genre=genre;
        this.director=director;
    }

    public String toString(){
        return "Title :"+title+"\nGenre : "+genre+"\n"+director;
    }
}
class Director{
    private String name;
    private String country;

    public Director(String name, String country){
        this.country=country;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Name : "+name+"\nCountry : "+country;
    }
}
public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Tiger","Action",new Director("Salim Khan","India"));
        System.out.println(movie.toString());
    }
}
