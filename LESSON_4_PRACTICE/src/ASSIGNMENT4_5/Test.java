package ASSIGNMENT4_5;

import ASSIGNMENT4_5.Good.Polygon;

public class Test {
    public static void main(String[] args) {
        Polygon[] polygon = {
                new Square(3),
                new Triangle(4, 5, 6),
                new Rectangle(3,4)
                ,
        };
        for(Polygon p: polygon){
            System.out.println("For this " + p.getClass().getSimpleName());
            System.out.println("Perimeter = " + p.computePerimeter());
            System.out.println();
        }

    }
}
