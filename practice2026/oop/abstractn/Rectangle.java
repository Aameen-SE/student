package practice2026.oop.abstractn;

public class Rectangle extends Shape{
    double l ,b;

    public Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }

    @Override
    void calculateArea() {
        double area = l*b;
        System.out.println("Area of the rectangle :"+area);
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.0,5.0);
        Shape circle = new Circle(4.0);
        circle.calculateArea();
        rectangle.calculateArea();

    }
}
