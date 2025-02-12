package javacore.forloop;

public class Program12 {
    public static void main(String[] args) {
        //wap to print all numbers between 1 to 150 multiple of 11.
        System.out.println("Print all numbers between 1 to 150 multiple of 11.");
        for(int i =1;i<=150;i++){
            if(i%11==0){
                System.out.println(i);
            }
        }
    }
}
