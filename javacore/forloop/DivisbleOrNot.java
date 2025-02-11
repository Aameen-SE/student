package javacore.forloop;

public class DivisbleOrNot {
    public static void main(String[] args) {
        //wap to print numbers which is completely divisible by 3 between 1 to 10
        int num=1;
        System.out.println("Number which is divisble by 3 between 1 to 10 ");
        for(int i =num;i<=10;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
