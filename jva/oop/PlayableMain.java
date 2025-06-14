package jva.oop;

//Create an interface Playable with a method play() and implement it in Movie and Game classes.

interface Playable{
    void play();
}

class Movie implements Playable{
    private String title;

    public Movie(String title){
        this.title=title;
    }
    @Override
    public void play() {
        System.out.println("Playing movie : "+title);
    }
}

class Game implements Playable{
    private String name;

    public Game(String name){
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Game is "+name);
    }
}
public class PlayableMain {
    public static void main(String[] args) {
        Movie movie= new Movie("Last Destination");
        movie.play();
        Game game= new Game("Pubg");
        game.play();
    }
}
