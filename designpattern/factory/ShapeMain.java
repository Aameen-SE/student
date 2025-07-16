package designpattern.factory;
//Create a ShapeFactory class that returns different shape objects based on input.
//Create an interface Shape with a method draw().
//Create three classes Circle, Rectangle, and Square that implement Shape.
//Create a ShapeFactory class with a method getShape(String shapeType) that returns the correct shape object.
//Write a small main program to use the factory to create and call draw() on different shapes.

import java.util.Scanner;

interface Shape{
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing circle : ");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle : ");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Square : ");
    }
}

class ShapeFactory {

    public Shape getShape(String shapeType){

        if(shapeType==null){
            return null;
        }

        switch (shapeType){
            case "Circle":
                return new Circle();

            case "Rectangle":
                return new Rectangle();

            case "Square":
                return new Square();

            default :
                return null;
        }
    }
}
public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word : Circle , Rectangle , Square : to draw :  ");
        String str = sc.nextLine();
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(str);
        shape1.draw();
    }
}
