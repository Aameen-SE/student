package jva.april30;

public class Prog4 {
    public static void main(String[] args) {
        //wap to find sum of a number
        int num =12345;
        int sum =0;

       while(num!=0){
            int dig = num%10;
            sum=sum+dig;
             num =num/10;
        }
        System.out.println("Sum of the number is : "+sum);
    }
}
