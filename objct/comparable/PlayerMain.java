package objct.comparable;
//Create a Player class with fields name, score, and age. Sort players by score ascending.
// If scores are equal, sort by age ascending.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Player implements Comparable<Player>{
    private String name;
    private int score;
    private  int age;

    public Player(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : "+name+"\nAge : "+age+"\nScore : "+score+"\n---------";
    }


    @Override
    public int compareTo(Player o) {
        int scoreCompare = Integer.compare(this.score,o.score);
        if(scoreCompare==0){
            return this.age-o.age;
        }
        return scoreCompare;
    }
}
public class PlayerMain {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        players.add(new Player("Hossain",145,20));
        players.add(new Player("Khan",135,28));
        players.add(new Player("Aameen",175,25));
        players.add(new Player("Aman",135,25));

        Collections.sort(players);
        for (Player p : players){
            System.out.println(p);
        }
    }
}
