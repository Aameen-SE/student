package jva.may22;
//Create a program that uses inheritance to calculate the area of different shapes:
//
//Create a base class called Shape with a method calculateArea().
//
//Create two derived classes:
//
//Circle with radius
//
//Rectangle with length and width
//
//Override calculateArea() in both subclasses.
//
//In the main() method:
//
//Create objects of Circle and Rectangle
//
//Call calculateArea() on each and display the result


class Shape{
    public void calculateArea(){
        System.out.println("Area calculation is not specified for generic shape");
    }
}

class Circle extends Shape{
    private int radius ;
    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea(){
        double pie =3.1416;
        double area = pie * radius *radius;
        System.out.println("Area of the circle : "+area);
    }
}
class Rectangle extends Shape{
    private double lenght ;
    private double breadth;
    public Rectangle(double length , double breadth){
        this.breadth=breadth;
        this.lenght=length;
    }

    @Override
    public void calculateArea(){
        double area = lenght*breadth;
        System.out.println("Area of the Rectangle : "+area);
    }



}
public class CalculateArea {
    public static void main(String[] args) {
        //Polymorphism 
        Shape circle = new Circle(4);
        circle.calculateArea();
        Shape rectangle=new Rectangle(12.3,6);
        rectangle.calculateArea();
    }
}
