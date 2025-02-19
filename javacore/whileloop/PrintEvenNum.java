package javacore.whileloop;

public class PrintEvenNum {
    public static void main(String[] args) {
        //wap to print all even numbers between 100 to 120.
        System.out.println(" Print all even numbers between 100 to 120.");
        int num=100;
        while(num<=120){
            if(num%2==0){
                System.out.print(num+" , ");
            }
            num++;
        }

    }
}
