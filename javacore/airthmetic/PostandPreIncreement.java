package javacore.airthmetic;

public class PostandPreIncreement {
    public static void main(String[] args) {
        //wap to do pre increment a number and assign its value to other number and print both number
        int num = 24;
        int num2 = ++num;
        System.out.println("num :"+num);
        System.out.println("Pre Increement of a num is :"+num2+"\n");

        //	2.	wap to do post increment a number and assign its value to other number and print both number
        int n1 = 54;
        int n2=n1++;
        System.out.println("n1 :"+n1);
        System.out.println("After Post increement :"+n2);
    }
}
