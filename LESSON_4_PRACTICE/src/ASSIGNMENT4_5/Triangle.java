package ASSIGNMENT4_5;

import ASSIGNMENT4_5.Good.Polygon;

public class Triangle implements Polygon {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double[] getArrayOfSides(){
        return new double[]{side1, side2, side3};
    }
}
