package javacore.forloop;

public class FirstFiveEven {
    public static void main(String[] args) {
        //wap to print first five even numbers.
        System.out.println("First five even numbers : ");
        int count =0;
        for (int i =1;count<5;)
        {
            if(i%2==0){
                System.out.println(i);
                count++;
            }
            i++;
        }

    }
}
