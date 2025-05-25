package jva.may25;

//Create an interface Playable with method play().
//
//Implement it in classes Football, Basketball, and Tennis.

interface Playable{
    void play();
}

class Football implements Playable{

    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

class Basketball implements Playable{

    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

class Tennis implements Playable{

    @Override
    public void play() {
        System.out.println("Playing tennis ");
    }
}

public class PlayableMain {
    public static void main(String[] args) {
        Playable p1 = new Football();
        Playable p2 = new Basketball();
        Playable p3 = new Tennis();

        p3.play();
        p2.play();
        p1.play();
    }
}
