package corejava.airthmetic;

public class MultiNum {
    public static void main(String[] args) {
        int x=35,y=54,z=5;
        mulTwo(x,y);
        mulThree(x,y,z);
    }
    public static void mulTwo(int a, int b)
    //wap to multiply two numbers?
    {
        System.out.println("Multiply of two number :"+(a*b));
    }
    public static void mulThree(int a,int b, int c){
        System.out.println("Multiply of three number :"+(a*b*c));
    }
}
