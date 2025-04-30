package jva.april30.ifelsee;

public class Prog1 {
    public static void main(String[] args) {
        //wap to find which number is greater among two numbers
        int num1=76,num2=98;
        greaterAmongTwo(num1,num2);
    }
    public static void greaterAmongTwo(int n1, int n2){
        if(n1>n2)
            System.out.println(n1+" is greater among them ");
        else
            System.out.println(n2+" is greater among them ");
    }
}
