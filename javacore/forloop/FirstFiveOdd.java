package javacore.forloop;

public class FirstFiveOdd {
    public static void main(String[] args) {
        //wap to print first five odd numbers.
        int count =1;
        for (int i = 1;count<=5;){
            if(i%2!=0){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
