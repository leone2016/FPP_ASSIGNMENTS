package Assignment3_4;

public  class Rectangle {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {

        this.width = width;
        this.length = length;
    }
    public double getWidth(){return width;}

    public double getLength(){return length;}
    public double computeArea() {


        return width * length;
    }
}