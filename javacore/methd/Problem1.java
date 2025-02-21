package javacore.methd;

public class Problem1 {
    public static void main(String[] args) {

        int num1 = 12, num2=45,num3=90;

        greaterTwo(num1,num2);
        greaterThree(num1,num2,num3);

    }
    //wap to find which number is greater among two numbers

    public static void greaterTwo(int n1,int n2){

        if(n1==n2)
            System.out.println("Both the number is equal to each other ");
        else if(n1>n2)
           System.out.println("Num1 is the greater than num2"+n1);
       else
           System.out.println("Num2 is the greater than num1 : "+n2);
    }

    //	2.	wap to find which number is greater among three numbers
    public static  void greaterThree(int n1,int n2,int n3){

        if(n1==n2&&n1==n3)
            System.out.println("All the three num is equal to each other ");
        else if (n1>n2&&n1>n3) {
            System.out.println("Num1 is greater than both the number : "+n1);
        }
        else if (n2>n1&&n2>n3) {
            System.out.println("Num2 is greater than both the number : "+n2);
        }
        else
            System.out.println("Num3 is greater than both the number "+n3);


    }
}
