package javacore.whileloop;

public class Program3 {
    public static void main(String[] args) {
        //wap to print all numbers from 1 to 10 except 3 and 7.
        int num=1;

        while(num<=10){
            if(num!=3&&num!=7){
                System.out.print(num+" ");
            }
            num++;
        }
    }
}
