package Assignment3_4;

public class Main {
    public static void main(String[] args){
     Circle circle = new Circle(5);
     Triangle triangle = new Triangle(5,6);
     Rectangle rectangle = new Rectangle(3,6);
    System.out.println("Area of Circle" + " " + circle.computeArea());
    System.out.println("Area of Triangle" + " " + triangle.computeArea());
    System.out.println("Area of Rectangle" + " " + rectangle.computeArea());
    }
}
