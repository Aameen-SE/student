package javacore.forloop;

public class Program8 {
    public static void main(String[] args) {
        //wap to print all numbers between 130 to 90 those are not divisible by 10.
        System.out.println("Print all numbers between 130 to 90 those are not divisible by 10.");

        for(int i = 130;i>=90;i--){
            if (i%10!=0){
                System.out.println(i);
            }
        }
    }
}
