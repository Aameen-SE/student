package javacore.whileloop;

public class FiveOddNum {
    public static void main(String[] args) {
        //wap to print first five odd numbers.
        int num=1;

        while(num<=10){
            if(num%2!=0){
                System.out.print(num+" , ");
            }
            num++;
        }
    }
}
