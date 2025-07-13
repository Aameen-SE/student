package training;

public class PostPreIncreement {
    public static void main(String[] args) {

        //Pre Increement

        int a=12;
        System.out.println("a : "+a);
        int y= ++a; // Pre Increement
        // a=a+1;
        System.out.println("a : "+a);
        System.out.println("y :"+y);                //++a : Pre Increement =
        //a++; Post Increement =

        int x = 23;
        int c = x++;
        System.out.println("x : "+x);
        System.out.println("c : "+c);
    }
}
