package practice2026.oop.abstractn;

public class Circle extends Shape{
    double r;

    public Circle(double r){
        this.r=r;
    }

    @Override
    void calculateArea() {
        double area = 3.14*r*r;
        System.out.println("Area of the circle  : "+area);
    }
}
