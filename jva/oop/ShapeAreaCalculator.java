package jva.oop;
//Create an abstract class Shape with an abstract method calculateArea().
// Implement this in subclasses Circle, Rectangle, etc., with formulas.

abstract class Shape{
    abstract void calculateArea();
}

class Circle extends  Shape{
    private  double pie= 3.14;
    private  int r;
    public Circle(int r){
        this.r=r;
    }
    @Override
    void calculateArea() {
        //pie r2
        double areaOfCircle = pie*r*r;
        System.out.println("Area of the circle : "+areaOfCircle);
    }
}

class Rectangle extends Shape{
     private  double length;
        private double width ;

        public Rectangle(double length, double width){
            this.length=length;
            this.width=width;
        }
    @Override
    void calculateArea() {
        double area = length*width;
        System.out.println("Area of rectangle : "+area);
    }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {

         Circle circle= new Circle(3);
         Rectangle rectangle= new Rectangle(14,15);
         circle.calculateArea();
         rectangle.calculateArea();
    }
}
