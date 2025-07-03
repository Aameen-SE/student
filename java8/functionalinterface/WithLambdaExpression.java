package java8.functionalinterface;

@FunctionalInterface
interface Shape{
    void print();
}

/*class Rectangle implements Shape{

    @Override
    public void print() {
        System.out.println("Rectangle print method");
    }
}*/
public class WithLambdaExpression {
    public static void main(String[] args) {
        Shape rectangle =   () ->
            System.out.println("Rectangle draw method");

        rectangle.print();

    }
}
