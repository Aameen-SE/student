package javacore.inherit;
class Cal{
    public int add(int n1,int n2){
        System.out.println("in cal cal");
        return n1+n2;
    }
}

class AdvCal extends Cal{
    public int add(int n1, int n2){
        System.out.println("in adv cal");
       return n1+n2;
    }
}

// over riding :- 

public class Problem2 {
    public static void main(String[] args) {
        AdvCal obj = new AdvCal();
        obj.add(51,62);
    }
}
