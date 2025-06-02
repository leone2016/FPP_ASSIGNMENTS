package ASSIGNMENT4_5;

import ASSIGNMENT4_5.Good.Polygon;

public class Rectangle implements Polygon {
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    @Override
    public double[] getArrayOfSides(){
        return new double[]{width,width,length,length};
    }

}
