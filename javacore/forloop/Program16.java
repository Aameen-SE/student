package javacore.forloop;

public class Program16 {
    public static void main(String[] args) {
        //wap to print all numbers from 1 to 10 except 3 and 7.
        System.out.println("Print all numbers from 1 to 10 except 3 and 7.");

        for(int i =1;i<=10;i++){
            if(i!=3&&i!=7){
                System.out.print(i+" , ");
            }
        }
    }
}
