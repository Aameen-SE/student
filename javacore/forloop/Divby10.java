package javacore.forloop;

public class Divby10 {
    public static void main(String[] args) {
        //wap to print numbers which is completely divisible by 10 between 1 to 100.
        int num =1;
        for(int i =num;i<=100;i++){
            if(i%10==0){
                System.out.println(i);
            }
        }
    }
}
