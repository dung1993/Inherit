package Geometry;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);

        Circle circle =new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5,"indigo",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3.5, 4.5);
        System.out.println(rectangle);
        rectangle = new Rectangle(3.5,6.7,"pink",false);
        System.out.println(rectangle);



    }
}