package javacore.forloop;

public class Program11 {
    public static void main(String[] args) {
        //wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
        System.out.println("Print all numbers between 10 to 70 those are not divisible by 3 and 5.");

        for(int i =10;i<=70;i++){
            if(i%3!=0&&i%5!=0){
                System.out.println(i);
            }
        }
    }
}
