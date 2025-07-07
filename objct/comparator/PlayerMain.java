package objct.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Create a Player class with fields name, score, and age.
// Write a comparator to sort players by score descending, then by age ascending.
class Player{
    private String name;
    private int score ;
    private  int age ;

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
        return "Name : "+name+" Age : "+age +" Score : "+score;
    }
}

class PlayerComparae implements Comparator<Player>{
    @Override
    public int compare(Player o1, Player o2) {
        int scoreSort = o2.getScore()-o1.getScore();

        if(scoreSort==0){
            return o1.getAge()-o2.getAge();
        }
        return scoreSort;
    }
}
public class PlayerMain {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
         players.add(new Player("Aameen",7,25));
         players.add(new Player("Arsalan",5,27));
         players.add(new Player("Kaif",2,24));
         players.add(new Player("Rashid",10,29));
         players.add(new Player("Rashid",10,23));

        Collections.sort(players,new PlayerComparae());

        for(Player p:players){
            System.out.println(p);
        }
    }
}
