package javacore.whileloop;

public class PrintDivisible {
    public static void main(String[] args) {
        //wap to print numbers which is completely divisible by 3 between 1 to 10.

        int num=1;
        while(num<=10){
            if(num%3==0){
                System.out.print(num+" , ");
            }
            num++;
        }
    }
}
