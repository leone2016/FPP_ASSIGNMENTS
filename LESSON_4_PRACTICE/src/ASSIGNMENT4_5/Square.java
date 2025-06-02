package ASSIGNMENT4_5;

import ASSIGNMENT4_5.Good.Polygon;

public class Square implements Polygon {
    private double side;
    public Square(double side){
        this.side = side;
    }
    @Override
    public double[]getArrayOfSides(){
        return new double[]{side,side,side,side};
    }
}
