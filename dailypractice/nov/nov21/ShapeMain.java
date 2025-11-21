package dailypractice.nov.nov21;
//Create an example of run-time polymorphism using a base class Shape
//
//and subclasses Circle, Rectangle with a draw() method.**

class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    };
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle Shape is drawn");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle Shape is drawn");
    }
}


public class ShapeMain {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();

    }
}
