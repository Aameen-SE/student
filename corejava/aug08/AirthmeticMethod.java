package corejava.aug08;

public class AirthmeticMethod {
    public static void main(String[] args) {
        int num1=2,num2=95;
        System.out.println("num1 :"+num1+" num2 :"+num2);
        System.out.println("Sum of two number :"+add(num1,num2));
        System.out.println("Subtraction result of two number : "+sub(num1,num2));
        System.out.println("Multiplication of two num :"+mul(num1,num2));
        System.out.println("Remainder of two number :"+rem(num1,num2));

    }
    //int add(int, int) - add two numbers and return sum
    public static int add(int n1,int n2){
        return (n1+n2);
    }

    //int sub(int, int) - subtract two numbers and return result

    public static int sub(int n1, int n2){
        return(n2-n1);
    }

    //int mul(int, int) - multiply two numbers and return result
    public static int mul(int n1,int n2){
        return n1*n2;
    }
    //int reminder(int, int) - find remainder and return
    public static int rem(int n1,int n2){
        return n2%n1;
    }



}
