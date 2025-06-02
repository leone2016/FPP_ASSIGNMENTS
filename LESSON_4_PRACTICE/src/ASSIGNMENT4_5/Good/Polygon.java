package ASSIGNMENT4_5.Good;

public interface Polygon {
    double[] getArrayOfSides();
    static double sum(double[] arr){
        double total = 0;
        for(double n : arr){
            total += n;
        }
        return total;
    }
    default double computePerimeter(){
        return sum(getArrayOfSides());
    }
}
