package javacore.typecasting;

public class Problem1 {
    public static void main(String[] args) {
        //wap to create a char variable but assign an int value and print that variable?

       char c=(int)67;
        System.out.println("Value of char c : "+c);

        //wap to create an int variable but assign a char value and print that variable?
        int var = 'A';
        System.out.println("Value of int var :"+var);

        //wap to declare two char variable and assign a value then add these two variables and print the sum
        char v =67 , d=68;
        int sum =  ((char) v+d);
        System.out.println("Sum of the two char variable : "+sum);




    }
}
