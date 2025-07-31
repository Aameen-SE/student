package dailypractice.july31;

import java.util.Scanner;
//Write a Java program that accepts the radius of a circle and calculates area and circumference.
public class CircleProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();

       final double pie = 3.141;

        double area = pie*radius*radius;
        System.out.println("Area of the circle : "+area);

        double circum = 2 * pie *radius;
        System.out.println("Circumference of the circle : "+circum);

    }
}
