package jva.may11;

public class FactorialOfANum {
    public static void main(String[] args) {
        // factorial of the number
        int fact=1;
        int num = 5;

        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of the given number : "+num+" is : "+fact);
    }
}
