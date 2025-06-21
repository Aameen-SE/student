package jva.whilelop;

public class FindEvenNum {
    public static void main(String[] args) {
        System.out.println(" All even numbers between 100 to 120.");
        int i=100;
        while(i<=120) {
            if (i % 2 == 0){
                System.out.print(i + " ");
        }
            i++;
        }
    }
}
