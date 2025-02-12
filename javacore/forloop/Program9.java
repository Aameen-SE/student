package javacore.forloop;

public class Program9 {
    public static void main(String[] args) {
        //wap to print all numbers between 30 to 80 those are divisible by 6 and 5
        System.out.println("Print all numbers between 30 to 80 those are divisible by 6 and 5");
        for(int i =30;i<=80;i++){
            if(i%6==0&&i%5==0){
                System.out.println(i);
            }
        }
    }
}
