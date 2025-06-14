package jva.forlop;

public class NumberCountDivBy7 {
    public static void main(String[] args) {
        //Count how many numbers from 1 to 100 are divisible by 7 using a loop.

        int count =0;

        for(int i=1;i<=100;i++){
            if(i%7==0){
                count++;
            }
        }
        System.out.println("Count : "+count);
    }
}
