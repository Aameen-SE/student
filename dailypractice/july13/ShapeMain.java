package dailypractice.july13;
//Create a base class called Shape with:
//
//A method double area() that returns 0.
//
//A method void display() that prints "This is a shape".
class Shape{

    public  double area(){
        return 0;
    }

    public  void display(){
        System.out.println("This is a shape ");
    }
}

//Create a derived class called Rectangle that extends Shape:
//
//Add fields length and width.
//
//Override the area() method to return area of rectangle.
//
//Override the display() method to print "This is a rectangle".

class Rectangle extends Shape{

    private  double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void display(){
        System.out.println("This is a rectangle ");
    }
}

//Create another derived class called Circle that extends Shape:
//
//Add field radius.
//
//Override the area() method to return area of circle (π * radius²).
//
//Override the display() method to print "This is a circle".

class Circle extends Shape{
    private double radius;

    final double pie = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPie() {
        return pie;
    }

    @Override
    public double area() {
        return (pie * radius*radius);
    }

    @Override
    public void display() {
        System.out.println("This is a circle");
    }
}
public class ShapeMain {

    public static void main(String[] args) {

                //Write a main() method to:
                //
                //Create one Rectangle object and one Circle object with some values.
                //
                //Call display() and print the area for both.

        Rectangle rectangle = new Rectangle(14,25);
        Circle circle = new Circle(45);

        rectangle.display();
        System.out.println(rectangle.area());

        circle.display();
        System.out.println(circle.area());
    }
}
