package ASSIGNMENT4_4;
import ASSIGNMENT4_4.good.Polygon;

public class Square extends ClosedCurve implements Polygon {
    private final double side;

    public Square(double side) {
        this.side = side;

    }

    public double computeArea() {
        return side * side;
    }
    public int getNumberOfSides(){
        return 4;
    }
    public double computePerimeter(){
        return 4 * (side);
    }



}