package javacore.ifelse;

public class Program3 {
    public static void main(String[] args) {
        //	3.	wap to print negative number among two given numbers( with if and without if).

        int num1 = -89,num2=-34;

        if(num1<0 && num2<0)
            System.out.println("num1 :"+num1+" and num2 : " +num2+" is the negative number ");
        else if (num1<0) {
            System.out.println("num1 :"+num1+" is the negative number ");
        } else if (num2<0) {
            System.out.println("num2 :"+num2+" is the negative number ");
        }
        else
            System.out.println("Both the number is positive number ");

    }
}
