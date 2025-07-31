package dailypractice.july31;
//Create a class Shape with area() method.
// Override it in Circle and Rectangle classes
// and demonstrate polymorphism.

class Shape{
     void area(){};
}

class Circle extends Shape{
    private double radius;

    Circle(int radius){
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


   void area(){
         double result = Math.PI*radius*radius;
       System.out.println("Area of circle : "+result);

     }
}

class Rectangle extends Shape{
    private double length;
    private double breadth;

    Rectangle(double length , double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getBreadth() {
        return breadth;
    }
    void area(){
     double result = length*breadth;
        System.out.println("Area of rectangle : "+result);
 }

}
public class ShapeMain {
    public static void main(String[] args) {
        Circle circle= new Circle(45);
        circle.area();

        Rectangle rectangle = new Rectangle(45,56);
        rectangle.area();
    }
}
