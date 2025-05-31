package ASSIGNMENT4_2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4,5,6);
        Square square  = new Square(3);
        Rectangle rectangle = new Rectangle(3,7);
        Circle circle = new Circle(3);
        System.out.println("The area of this Triangle is " + " " + triangle.computeArea());
        System.out.println("The area of this Square is" + " " + square.computeArea());
        System.out.println("The area of this Rectangle is" + " " + rectangle.computeArea());
        System.out.println("The area of this Circle is" + " " + circle.computeArea());
    }
}
