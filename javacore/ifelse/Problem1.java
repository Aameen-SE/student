package javacore.ifelse;

public class Problem1 {
    public static void main(String[] args) {
        //wap to print greatest number among two given numbers( with if and without if).
        int num1 = 69 , num2 = 89;
        if(num1>num2){
            System.out.println("Num1 : "+num1+" is the Greatest Number");
        } else if (num2>num1) {
            System.out.println("Num2 : "+num2 +" is the Greatest Number ");
        } else {
            System.out.println("Both the number is equal to each other ");
        }
    }
}
