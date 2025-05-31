package ASSIGNMENT4_4;

//import ASSIGNMENT4_2.ClosedCurve;
import ASSIGNMENT4_4.good.Polygon;

public class Rectangle extends ClosedCurve implements Polygon {
    private double width;
    private double length;
public Rectangle(double width, double length){
    this.width = width;
    this.length = length;
}
    public double computeArea(){
        return width * length;
    }
    public int getNumberOfSides(){
    return 4;
    }
    public double computePerimeter(){
    return 2 * (width + length);
    }
}
