package corejava.airthmetic;

public class AddNum {
    public static void main(String[] args) {
        int x=34,y=54,z=12;
        sumTwo(x,y);
        sumThree(x,y,z);
    }
    public static void sumTwo(int a, int b)
    {
        //sum of the two number
        System.out.println("Sum of two number sum:"+(a+b));
    }
    public static void sumThree(int a, int b, int c){
        System.out.println("Sum of three number sum:"+(a+b+c));
    }
}
