package ASSIGNMENT4_4;

import ASSIGNMENT4_4.good.Polygon;

public class Test2 {
    public static void main(String[] args) {
        Polygon[] polygons = {new Square(3), new Triangle(4,5,6), new Rectangle(3,4)};
        for (Polygon p: polygons){
            System.out.println("For this " + p);
            System.out.println("Number of sides = " + p.getNumberOfSides());
            System.out.println("Perimeter = " + p.computePerimeter());
            System.out.println();
        }
    }
}
