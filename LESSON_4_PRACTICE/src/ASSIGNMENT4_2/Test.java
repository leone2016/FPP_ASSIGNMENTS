package ASSIGNMENT4_2;

public class Test {

    public static void main(String[] args) {

        ClosedCurve[] objects = { 
            new Triangle(4, 5, 6),
            new Square(3),
            new Circle(3),
            new Rectangle(4, 2) };
        // compute areas
        for (ClosedCurve cc : objects) {
            String nameOfCurve = cc.getClass().getSimpleName();
            System.out.printf("The area of this %s is %.2f \n",
                    nameOfCurve, cc.computeArea());
        }
    }
}



